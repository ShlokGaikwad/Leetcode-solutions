class Solution {
    public int numRescueBoats(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int i=0,j=n-1;
        int count=0;
        while(i<=j){
            if(arr[i]+arr[j]<=k){
                count++;
                i++;
                j--;
            }else if(arr[i]+arr[j]>k){
                count++;
                j--;
            }else{
                count++;
            }
        }
        return count;
    }
}