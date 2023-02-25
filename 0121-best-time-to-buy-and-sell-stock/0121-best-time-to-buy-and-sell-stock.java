class Solution {
    public int maxProfit(int[] arr) {
        int l=Integer.MAX_VALUE;
        int op=0,pist=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<l){
                l=arr[i];
            }
            pist=arr[i]-l;
            
                if(op<pist){
                    op=pist;
                }
        }
        return op;
    }
}