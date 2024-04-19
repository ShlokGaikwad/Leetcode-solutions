class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // System.out.print(map.toString());
        // return new int[2];
        List<Integer> li=new ArrayList<>(new HashSet(map.keySet()));
        li.sort((a,b)->map.get(b)-map.get(a));
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}