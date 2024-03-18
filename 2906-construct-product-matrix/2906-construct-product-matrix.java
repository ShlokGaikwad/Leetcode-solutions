class Solution {
public int[][] constructProductMatrix(int[][] grid) {
int mod = 12345;
int row = grid.length;
int col = grid[0].length;
int[][] prod = new int[row][col];
int leftPro = 1;
int prev = 1;
for(int i = 0; i < row; i++){
for(int j = 0; j < col; j++){
prod[i][j] = (leftPro % mod) * (prev % mod);
prev = grid[i][j] % mod;
leftPro = prod[i][j] % mod;
}
}
int rightPro = 1;
for(int i = row-1; i >= 0; i--){
for(int j = col-1; j >= 0; j--){
prod[i][j] = (rightPro % mod) * (prod[i][j] % mod);
rightPro = (rightPro % mod) * (grid[i][j] % mod);
}
}
for(int i = 0; i < row; i++){
for(int j = 0; j < col; j++){
prod[i][j] %= mod;

        }
    }
    return prod;
}
}