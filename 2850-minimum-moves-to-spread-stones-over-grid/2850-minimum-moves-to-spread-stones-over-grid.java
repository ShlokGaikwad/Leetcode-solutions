class Solution {
    public int minimumMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        List<Pair> extra = new ArrayList<>();
        List<Pair> empty = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) continue;
                else if(grid[i][j] == 0) empty.add(new Pair(i, j));
                else extra.add(new Pair(i, j));
            }
        }

        return helper(grid, 0, extra, empty);
    }

    private int helper(int[][] grid, int index, List<Pair> extra, List<Pair> empty) {
        if(index == empty.size()) return 0;

        Pair P = empty.get(index);
        int R = P.r;
        int C = P.c;

        int moves = Integer.MAX_VALUE;
        for(int i = 0; i < extra.size(); i++) {
            Pair p = extra.get(i);
            int r = p.r;
            int c = p.c;

            if(grid[r][c] == 1) continue;

            int currMoves = Math.abs(R-r) + Math.abs(C-c);
            grid[r][c] = grid[r][c] - 1;
            moves = Math.min(currMoves + helper(grid, index+1, extra, empty), moves);
            grid[r][c] = grid[r][c] + 1;
        }

        return moves;
    }
}

class Pair {
    int r;
    int c;

    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}