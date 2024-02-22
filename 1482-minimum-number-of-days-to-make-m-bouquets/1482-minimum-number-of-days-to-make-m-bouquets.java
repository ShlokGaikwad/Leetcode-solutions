class Solution {
    public int minDays(int[] arr, int m, int k) {
        return min(arr,m,k);
    }
   public static int min(int arr[],int m,int k){
       long val=(long)m*k;
       if(val>arr.length) return -1;
       int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           low=Math.min(arr[i],low);
           high=Math.max(arr[i],high);
       }
       int ans=0;
       while(low<=high){
           int mid=(high+low)/2;
           if(possible(arr,mid,m,k)){
               ans=mid;
               high=mid-1;
           }else{
               low=mid+1;
           }
       }
       return ans;
   }
    public static boolean possible(int arr[],int time,int m,int k){
        int count=0,deck=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=time){
                count++;
            }else{
                deck+=(count/k);
                count=0;
            }
        }
        deck+=(count/k);
        return deck>=m;
    }
}