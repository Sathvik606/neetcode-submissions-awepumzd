class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == abbr) return true;
        int n = word.length(), m = abbr.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            char a_c = abbr.charAt(j);
            char w_c = word.charAt(i);

            if (Character.isDigit(a_c)) {
                if (a_c == '0') return false;
                int len = 0;
                while (j < m && Character.isDigit(abbr.charAt(j))) {
                    len = len * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += len;
            } else {
                if (a_c != w_c) return false;
                i++;
                j++;
            }
        }
        return i == n && j == m;
    }
}