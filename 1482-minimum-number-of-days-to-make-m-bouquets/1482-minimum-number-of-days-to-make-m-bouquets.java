class Solution {
    public int minDays(int[] arr, int m, int k) {
        return min(arr,m,k);
    }
    public int min(int arr[],int m,int k){
        long val=(long)m*k;
        if(val>arr.length) return -1;
        
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            low=Math.min(arr[i],low);
            high=Math.max(arr[i],high);
        }
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
    public boolean possible(int arr[],int time,int m,int k ){
        int count=0,NoD=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=time){
                count++;
            }else{
                NoD+=(count/k);
                count=0;
            }
        }
        NoD+=(count/k);
        return NoD>=m;
    }
}