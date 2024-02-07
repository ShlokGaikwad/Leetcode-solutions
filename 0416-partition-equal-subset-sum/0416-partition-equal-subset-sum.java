class Solution {
    public boolean targetSum(int[] nums,int target){
        int n = nums.length;
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i =0;i<n+1;i++){
            dp[i][0] = true;
        }

        for(int i =1;i<n+1;i++){
            for(int j =1;j<target+1;j++){
                if(nums[i-1] <= j && dp[i-1][j-nums[i-1]]){
                    dp[i][j] = true;
                }
                else if(dp[i-1][j]){
                    dp[i][j] = true;
                }
            }
        }
        return dp[n][target];
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += nums[i];
        }
        if(sum % 2 !=0){
            return false;
        }
        int target = sum/2;
       return targetSum(nums,target);
    }
} 