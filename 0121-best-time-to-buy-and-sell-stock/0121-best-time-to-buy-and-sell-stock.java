class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE,tp=0,op=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
                tp=arr[i]-min;
                if(op<tp){
                    op=tp;
                }
            }
        return op;
        
    }
}