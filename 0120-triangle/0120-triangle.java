class Solution {
    private Integer[][] dp;
    public int find(List<List<Integer>> tri,int i,int level){
        if(level==tri.size()){
            return 0;
        }
        if(dp[i][level]!=null){
            return dp[i][level];
        }
        int first=tri.get(level).get(i)+find(tri,i,level+1);
        int second=tri.get(level).get(i)+find(tri,i+1,level+1);
        return dp[i][level]=Math.min(first,second);
    }
    public int minimumTotal(List<List<Integer>> tri) {
        dp=new Integer[tri.size()][tri.size()];
        return find(tri,0,0);
    }
}