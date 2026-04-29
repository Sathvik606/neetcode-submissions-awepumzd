class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 1; i < n; i++) {
            int[] last = res.get(res.size() - 1);
            int[] curr = intervals[i];

            int s1 = last[0], e1 = last[1],
                s2 = curr[0], e2 = curr[1];

            if (e1 >= s2 && e2 >= s1) {
                last[0] = Math.min(s1, s2);
                last[1] = Math.max(e1, e2);
            } else {
                res.add(curr);
            }
        }
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
