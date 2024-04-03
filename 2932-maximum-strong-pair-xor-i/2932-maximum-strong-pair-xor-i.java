class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int maxi=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]))
                {
                    maxi=Math.max(maxi,(nums[i]^nums[j]));
                }
            }
        }
        return maxi;
    }
}