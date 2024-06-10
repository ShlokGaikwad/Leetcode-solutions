class Solution {
    public int findPoisonedDuration(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]+k){
                sum+=arr[i+1]-arr[i];
            }else{
                sum+=k;
            }
        }
        sum+=k;
        return sum;
    }
}