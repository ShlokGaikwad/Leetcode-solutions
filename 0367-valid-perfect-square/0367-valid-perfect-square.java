class Solution {
    public boolean isPerfectSquare(int num) {
        long s=1,e=num;
        while(s<=e){
            long mid=s+(e-s)/2;
            long sq=mid*mid;
            if(sq>num){
                e=mid-1;
            }else if(sq<num){
                s=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}