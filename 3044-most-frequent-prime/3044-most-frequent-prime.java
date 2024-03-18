class Solution {

    private static final int[][] DIRS = {{0, 1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {1, -1}, {1, 0}, {1, 1}};
    private static final Set<Integer> PRIMES = buildPrimes();

    public int mostFrequentPrime(int[][] mat) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int[] dir : DIRS) {
                    dfs(map, mat, i, j, dir[0], dir[1], 0);
                }
            }
        }
        int res = -1;
        int maxFreq = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (value > maxFreq) {
                maxFreq = value;
                res = key;
            } else if (value == maxFreq) {
                res = Math.max(res, key);
            }
        }
        return res;
    }

    private void dfs(Map<Integer, Integer> map, int[][] mat, int i,
                     int j, int ii, int jj, int num) {
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[i].length) {
            return;
        }
        num = (num * 10) + mat[i][j];
        if (PRIMES.contains(num)) {
            map.merge(num, 1, Integer::sum);
        }
        dfs(map, mat, i + ii, j + jj, ii, jj, num);
    }

    private static Set<Integer> buildPrimes() {
        Set<Integer> res = new HashSet<>();
        int n = 1_000_001;
        boolean[] seen = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!seen[i]) {
                if (i > 10) res.add(i);
                for (int j = i + i; j < n; j += i) {
                    seen[j] = true;
                }
            }
        }
        return res;
    }
    
}