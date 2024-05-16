class Solution {
    public int numIslands(char[][] arr) {
        int n=arr.length,m=arr[0].length;
        boolean vis[][]=new boolean[n][m];
         int count=0;
          for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
             if(arr[i][j]=='1' && vis[i][j]==false){
               dsf(arr,vis,i,j,n,m);
               count++;
             }
           }
         }
         return count;
    }
    public static void dsf(char arr[][],boolean vis[][],int i,int j,int n,int m){
      if(i<0 || j<0 ||i>=n ||j>=m||vis[i][j]==true|| arr[i][j]=='0'){
        return;
      }
      vis[i][j]=true;
      dsf(arr,vis,i+1,j,n,m);
      dsf(arr,vis,i-1,j,n,m);
      dsf(arr,vis,i,j+1,n,m);
      dsf(arr,vis,i,j-1,n,m);
    }
}