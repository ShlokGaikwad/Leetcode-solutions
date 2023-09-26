class Solution {
    public int[] buildArray(int[] nums) {
        int arr[]=new int[nums.length];
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
    
}