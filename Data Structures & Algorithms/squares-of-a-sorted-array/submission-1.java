class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int k = n - 1;
        int i = 0, j = n - 1;
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                ans[k--] = nums[i] * nums[i];
                i++;
            } else {
                ans[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return ans;
    }
}