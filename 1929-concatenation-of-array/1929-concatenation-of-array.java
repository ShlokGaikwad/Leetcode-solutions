class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        int n=arr.length;
        int k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                arr[k]=nums[j];
                k++;
            }
        }
        return arr;
    }
}