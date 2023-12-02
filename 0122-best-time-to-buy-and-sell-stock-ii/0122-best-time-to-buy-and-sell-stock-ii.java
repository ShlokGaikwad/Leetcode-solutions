class Solution {
    public int maxProfit(int prices[]){
        int dp[][]=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                dp[i][j]=-1;
            }
        }
        return fun(0,1,prices,prices.length,dp);
    }
    static int fun(int i,int buy,int prices[],int n,int dp[][]){
        if(i==n) return 0;
        int profit=0;
        if(dp[i][buy]!=-1) return dp[i][buy];
        
        if(buy==1){
            profit=Math.max(-prices[i]+fun(i+1,0,prices,n,dp),fun(i+1,1,prices,n,dp));
        }else{
            profit=Math.max(prices[i]+fun(i+1,1,prices,n,dp),fun(i+1,0,prices,n,dp));
        }
        return dp[i][buy]=profit;
    }
}
