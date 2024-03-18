class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        Integer[][] memo = new Integer[n + 1][n + 1];

        return helper(nums, 0, n - 1, 0, memo);
    }

    int helper(int[] nums, int start, int end, int prev, Integer[][] memo){
        if(start >= end) return 0;
        if(memo[start][end] != null) return memo[start][end];

        int first = 0, last = 0, both = 0;

        if(nums[start] + nums[start +1] == prev || (start == 0 && end == nums.length -1)){
            first = 1 + helper(nums, start +2, end, nums[start] + nums[start +1], memo);
        }
        if(nums[end] + nums[end -1] == prev || (start == 0 && end == nums.length -1)){
            last = 1 +  helper(nums, start, end -2, nums[end] + nums[end -1], memo);
        } 
        if(nums[start] + nums[end] == prev || (start == 0 && end == nums.length -1)){
            both = 1 +  helper(nums, start +1, end -1, nums[start] + nums[end], memo);
        }

        return memo[start][end] = Math.max(first, Math.max(both, last));
    }
}