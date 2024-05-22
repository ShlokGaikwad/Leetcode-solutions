class Solution {
    public boolean canPlaceFlowers(int[] arr, int k) {
        int n = arr.length;

        if(k==0)return true;


        for(int i=0; i<n; i++){
           if(arr[i] == 0 && (i == 0 || arr[i-1] == 0) && (i ==n-1 || arr[i+1] == 0)){
               k--;
               arr[i] = 1;

               if(k==0)return true;
           }
        }

        return false;
    }
}