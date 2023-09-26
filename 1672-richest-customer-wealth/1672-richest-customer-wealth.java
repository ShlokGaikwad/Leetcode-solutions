class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts[0].length;
        int m=accounts.length;
        int sum1=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(sum>=sum1){
                sum1=sum;
            }
        }
        return sum1;
    }
}