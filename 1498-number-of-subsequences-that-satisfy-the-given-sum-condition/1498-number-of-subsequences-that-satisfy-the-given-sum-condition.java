class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = (int)1e9+7;
        int n = nums.length;
        int[] pow = new int[n];
        pow[0] = 1;
        for(int i=1;i<n;i++)
            pow[i] = pow[i-1]*2%mod;
        int j = n-1;
        int i=0;
        int ans = 0;
        while(i<=j)
        {
            if(nums[i]+nums[j]>target)
                j--;
             else{ 
                ans =  (ans+pow[j-i])%mod;
                i++;
            }
        }
        return (int)ans;
    }
}