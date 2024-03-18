class Solution {
    public int minGroupsForValidAssignment(int[] nums) {
       Map<Integer,Integer>ans=new HashMap<>();
       for(int x:nums){
           ans.merge(x,1,Integer::sum);
       }
       int k=nums.length;
       for(int i:ans.values()){
            k=Math.min(i,k);
       }
         for (;; --k) {
            int a = 0;
            for (int v : ans.values()) {
                if (v / k < v % k) {
                    a = 0;
                    break;
                }
                a += (v + k) / (k + 1);
            }
            if (a > 0) {
                return a;
            }
        }
    }
}