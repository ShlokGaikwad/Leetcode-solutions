class Solution {
    public boolean lemonadeChange(int[] arr) {
        int five=0,ten=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5 ){
                five++;
            }else if(arr[i]==10 ){
                five--;
                ten++;
            }else if(ten>0){
                   ten--;
                   five--;
               }else{
                   five-=3;
               }
                if(five<0){
                    return false;
                }
        }
        return true;
    }
}