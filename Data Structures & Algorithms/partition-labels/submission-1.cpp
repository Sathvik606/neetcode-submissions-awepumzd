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
        int i = 0, start = 0, end = 0;
        while (i < n) {
            end = max(end, last[s[i] - 'a']);
            if (i == end) {
                res.push_back(end - start + 1);
                start = end + 1;
            }
            i++;
        }
        return res;
    }
};
