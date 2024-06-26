// class Solution {
//     public int findMaxLength(int[] nums) {
//         int count = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int zeros = 0, ones = 0;
//             for (int j = i; j < nums.length; j++) {
//                 if (nums[j] == 0) {
//                     zeros++;
//                 } else {
//                     ones++;
//                 }
//                 if (zeros == ones) {
//                     count = Math.max(count, j - i + 1);
//                 }
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int zeros = 0, ones = 0, maxLen = 0;
        
        hashmap.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeros++; else ones++;
            int diff = zeros - ones;
            
            if (hashmap.containsKey(diff)) {
                maxLen = Math.max(maxLen, i - hashmap.get(diff));
            } else {
                hashmap.put(diff, i);
            }
        }
        
        return maxLen;
    }
}