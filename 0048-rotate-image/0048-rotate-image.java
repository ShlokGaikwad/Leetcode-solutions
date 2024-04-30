class Solution {
    public void rotate(int[][] arr) {
        int n=arr.length,m=arr[0].length;
        // int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
               int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
               int temp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
    }
}