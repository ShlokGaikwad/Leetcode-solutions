class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,z=0,max=0,n=nums.length;
        while(r<n){
            if(nums[r]==0) z++;
            
            if(z>k){
                if(nums[l]==0) z--;
                l++;
            }
            
            if(z<=k){
                
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}