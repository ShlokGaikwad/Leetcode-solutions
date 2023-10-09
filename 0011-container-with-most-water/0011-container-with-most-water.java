class Solution {
    public int maxArea(int[] arr) {
        int n=arr.length,max=0;
        int left=0,right=n-1;
        while(left<right){
            int h=Math.min(arr[left],arr[right]);
            int width=right-left;
            int area=h*width;
            max=Math.max(area,max);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}