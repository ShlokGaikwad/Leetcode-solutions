class Solution {
    public int maximumWealth(int[][] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr[i].length;j++){
                temp+=arr[i][j];
                res=Math.max(res,temp);   
            }
        }
        return res;
    }
}