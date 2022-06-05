class Solution {
    public int[] sortedSquares(int[] nums) {
       int arr[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int index=nums.length-1;
        while(i<=j){
            if(Math.abs(nums[i])>=Math.abs(nums[j])){
                arr[index]=nums[i]*nums[i];
                i++;
            }else{
                arr[index]=nums[j]*nums[j];
                j--;
            }
            index--;
        }
        return arr;
    }
}