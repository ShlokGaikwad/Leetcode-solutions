class Solution {
    public int[] searchRange(int[] arr, int k) {
        int n = arr.length;
        int l = upper(arr, n, k, true);
        int r = upper(arr, n, k, false);
        return new int[]{l, r};
    }

    public static int upper(int arr[], int n, int k, boolean flag) {
        int low = 0, high = n-1, ans = -1;

        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[mid]==k){
                if(!flag){
                    low = mid + 1;
                    ans = mid; 
                }else{
                    high = mid - 1;
                    ans = mid;
                }

            }else if(arr[mid]>k){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}