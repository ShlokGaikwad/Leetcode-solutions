class Solution {
    // Similar to Insertion Sort
    public boolean canSortArray(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int idx = i;
            int setBitsI = findSetBits(nums[idx]);
            for(int j = idx - 1; j >= 0; j--){
                int setBitsJ = findSetBits(nums[j]);
                if(nums[idx] < nums[j] && setBitsI == setBitsJ){
                    swap(j, idx, nums);
                    idx--;
                } else {
                    break;
                }
            }
        }

        int prevElement = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(prevElement > nums[i]){
                return false;
            }
            prevElement = nums[i];
        }

        return true;
    }

    public int findSetBits(int no){
        int setBits = 0;
        for(int k = 0; k < 9; k++){
            if((no & (1 << k)) != 0){
                setBits++;
            }
        }
        return setBits;
    }

    public void swap(int i, int j, int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}