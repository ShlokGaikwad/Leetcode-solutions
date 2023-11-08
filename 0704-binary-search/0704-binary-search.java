class Solution {
    public int search(int[] nums, int target) {
        return binary(nums.length,target,nums,0,nums.length-1);
        
    }
    static int binary(int n,int k,int arr[],int s,int e){
            if(s>e) return -1;
            int mid=s+(e-s)/2;
            if(arr[mid]==k) return mid;
            else{
                if(arr[mid]<k) return binary(n, k,arr,mid+1,e);
                else return binary(n, k,arr,0,mid-1);
            }

    }
}