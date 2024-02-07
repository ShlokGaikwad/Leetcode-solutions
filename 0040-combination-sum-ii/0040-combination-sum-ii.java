class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(candidates);       // so as to get sorted combinations and therefore would be distinguishable by hashset
        comb(new ArrayList<Integer>(), candidates, 0,target, ans);

        return ans;
    }

    
    static void comb(ArrayList<Integer> p,int[] up, int idx, int target,  List<List<Integer>> ans ){

        if (target == 0) {
            ans.add(new ArrayList <> (p));
            return;
        }

        for (int i = idx; i < up.length; i++) {

            if (i > idx && up[i] == up[i - 1]) continue;
            if (up[i] > target) break;

            p.add(up[i]);
            comb( p,up,i + 1, target - up[i], ans);
            p.remove(p.size() - 1);
        }
    }
}