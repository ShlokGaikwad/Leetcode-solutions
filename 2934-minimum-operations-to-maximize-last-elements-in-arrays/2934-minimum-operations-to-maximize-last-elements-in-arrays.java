class Solution {
     public int minOperations(int[] A, int[] B) {
        int dp1 = 0, dp2 = 0, n = A.length;
        int mi = Math.min(A[n - 1], B[n - 1]), ma = Math.max(A[n - 1], B[n - 1]);
        for (int i = 0; i < n; i++) {
            int a = A[i], b = B[i];
            if (Math.max(a, b) > ma) return -1;
            if (Math.min(a, b) > mi) return -1;
            if (a > A[n - 1] || b > B[n - 1]) dp1++;
            if (a > B[n - 1] || b > A[n - 1]) dp2++;
        }
        return Math.min(dp1, dp2);
    }
}