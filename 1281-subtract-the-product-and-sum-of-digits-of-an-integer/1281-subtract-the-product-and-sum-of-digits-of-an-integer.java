class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int add=0;
        while(n>0){
           mul*=n%10;
            add+=n%10;
            n=n/10;
        }
        return mul-add;
        
    }
}