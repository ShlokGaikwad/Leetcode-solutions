class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0.0;
        for(int i=0;i<k;i++){
             max+=nums[i];
            // max=max/k;
        }
        double sum=max;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            // sum/=k;
            max=Math.max(sum,max);
        }
        return max/k;
    }
}