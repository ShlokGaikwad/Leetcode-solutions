class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int start = j + 1;
                int end = n - 1;

                while (start < end) {

                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {

                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        start++;
                        end--;

                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }

                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }
                    } else if (sum < target) {

                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return result;
    }
}