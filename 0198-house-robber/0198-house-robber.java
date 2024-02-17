class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        for(int d=0;d<=nums.length;d++){
            dp[d]=-1;
        }
        int sum=house(nums,0,dp);
        return sum;
    }
    public int house(int arr[],int i,int dp[]){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        
        int t=arr[i]+house(arr,i+2,dp);
        int dt=0+house(arr,i+1,dp);
        
        return dp[i]=Math.max(t,dt);
    }
}