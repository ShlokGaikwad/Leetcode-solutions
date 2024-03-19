class Solution {
    public int[] twoSum(int[] arr, int k) {
        int s=0,e=arr.length-1;
        while(s<=e){
            if(arr[s]+arr[e]==k){
                return new int[] {s+1,e+1};
            }else if(arr[s]+arr[e]>k){
                e--;
            }else{
                s++;
            }
        }
        return new int[] {s+1,e+1};
    }
}