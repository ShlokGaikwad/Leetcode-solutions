class Solution {
    public int findMin(int[] nums) {
        int s=0,e=nums.length-1,ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>=nums[s]){
                ans=Math.min(ans,nums[s]);
                s=mid+1;
            }else{
                e=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
}