class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
	int leftProd = 1;
	for(int i = 0; i < nums.length; i++) {
		ans[i] = leftProd;
		leftProd *= nums[i];
	}

	int rightProd = 1;
	for(int i = nums.length-1; i >= 0; i--) {
		ans[i] *= rightProd;
		rightProd *= nums[i];
	}

	return ans;
    }
}