class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n = bottomLeft.length;
        int maxSide = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(bottomLeft[i][0] >= topRight[j][0] || bottomLeft[i][1] >= topRight[j][1] || bottomLeft[j][0] >= topRight[i][0] || bottomLeft[j][1] >= topRight[i][1]) continue;
                int delX = Math.min(topRight[i][0], topRight[j][0])-Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int delY = Math.min(topRight[i][1], topRight[j][1])-Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                maxSide = Math.max(maxSide, Math.min(delX, delY));
            }
        }
        return (long)maxSide*maxSide;
    }
}