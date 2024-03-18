class Solution {
    public int minimumArrayLength(int[] nums) {

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if ( nums[i] == min ) {
                cnt++;
            }
        }

        if ( cnt % 2 == 1) {
            cnt /= 2;
            cnt++;
        } else{
            cnt /= 2;
        }

        for(int i = 0; i < nums.length; i++) {
            if ( nums[i] % min != 0 ) return 1;
        }

        return cnt;
    }
}