class Solution {
public:
    vector<int> partitionLabels(string s) {
        int n = s.size();
        vector<int> last(26, -1);

        // last occurence of each occurrence
        for (int i = 0; i < n; i++) {
            int idx = s[i] - 'a';
            last[idx] = i;
        }

        vector<int> res;
        int i = 0;
        while (i < n) {
            int end = last[s[i] - 'a'];
            int j = i;
            while (j < end) {
                end = max(end, last[s[j] - 'a']);
                j++;
            }
            res.push_back(j - i + 1);
            i = j + 1;
        }
        return res;
    }
};
