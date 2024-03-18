class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        int zeroCounts1 = 0, zeroCounts2 = 0;
        for (int i = 0; i < nums1.length; i++) {
            sum1 += nums1[i];
            if (nums1[i] == 0) {
                sum1++;
                zeroCounts1++;
            }        
        }
        for (int i = 0; i < nums2.length; i++) {
            sum2 += nums2[i];
            if (nums2[i] == 0) {
                sum2++;
                zeroCounts2++;
            }        
        }

        if(sum1==sum2) return sum1;        
        
        if (sum2>sum1 && zeroCounts1 == 0)
            return -1;

        if (sum1 > sum2 && zeroCounts2 == 0)
            return -1;

        
       return Math.max(sum1,sum2);
    }
}