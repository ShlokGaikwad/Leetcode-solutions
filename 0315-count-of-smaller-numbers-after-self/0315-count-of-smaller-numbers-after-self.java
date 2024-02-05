class Solution {
    int[] freqTree;
    public List<Integer> countSmaller(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int g: nums) {
            min=min<=g?min:g;
            max=max>=g?max:g;
        }
        freqTree=new int[(max-min+1)+1];
        LinkedList<Integer> resp = new LinkedList<>();
        for(int i=nums.length-1;i>-1;i--) {
            resp.push(query(nums[i]-min));
            update(nums[i]-min+1,1);
        }
        return resp;
    }

    void update(int index, int val) {
        while(index<freqTree.length) {
            freqTree[index]+=val;
            index+=index&-index;
        }
    }

    int query(int index) {
        int sum=0;
        while(index>0) {
            sum+=freqTree[index];
            index-=index&-index;
        }
        return sum;
    }
}