class Solution {
    public int maxArea(int[] arr) {
        int s=0,e=arr.length-1;
        int max=0;
        while(s<e){
            int h=Math.min(arr[s],arr[e]);
            int w=e-s;
            int area=h*w;
            max=Math.max(area,max);
            if(arr[s]<arr[e]){
                s++;
            }else{
                e--;
            }
        }
        return max;
    }
}