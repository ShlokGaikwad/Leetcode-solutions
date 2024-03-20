class Solution {
    public char nextGreatestLetter(char[] arr, char k) {
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(k<arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return arr[s%arr.length];
    }
}