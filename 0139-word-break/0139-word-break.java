class Solution {
    String s;
    List<String> arr;
    int n;
    int[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.s=s;
        this.arr=wordDict;
        n=s.length();
        memo = new int[n];
        Arrays.fill(memo, -1);
        return dp(0);
    }
    public boolean dp(int i) {
        if (i == n) {
            return true;
        }
        if (memo[i] != -1) {
            return (memo[i]==1);
        }
        for (String word : arr) {
            int len = word.length();
            if (i+len <= n && s.substring(i, i+len).equals(word)) {
                //word is a valid prefix 
                if (dp(i+len)) {
                    memo[i]=1;
                    return true;
                }
            }
        }
        memo[i]=0;
        return false;
    }
}