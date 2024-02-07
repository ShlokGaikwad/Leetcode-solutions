class Solution {
    public int longestPalindromeSubseq(String s) {
        char []str = s.toCharArray();
        int [][] answ = new int[s.length() + 1][s.length() + 1];
        int n = s.length();
        for(int i = 0; i < s.length(); i++)
        {
            for (int j = n - 1; j > -1; j--)
            {
                if (str[i] == str[j]) answ[i + 1][n - j] = answ[i - 1 + 1][n - j - 1 ] + 1;
                else answ[i + 1][n - j ] = Math.max(answ[i - 1 + 1][n - j ], answ[i + 1][n - j - 1]);
            }
        }
        return answ[n][n];
    }
    public int minInsertions(String s) {
        return s.length() - longestPalindromeSubseq(s);
    }
}