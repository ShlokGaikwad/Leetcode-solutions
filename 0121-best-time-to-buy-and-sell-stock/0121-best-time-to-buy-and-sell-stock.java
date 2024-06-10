class Solution {
    public int maxProfit(int[] arr) {
        int l=0,r=0,max=0;
        while(r<arr.length){
            if(arr[l]>=arr[r]){
                l=r;
                r++;
            }else{
                int sum=arr[r]-arr[l];
                max=Math.max(max,sum);
                r++;
            }
        }
        return max;
    }
}