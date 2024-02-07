class Solution {

    String ans = "";

    public void kth(int total, int n, int k, ArrayList<Integer> nums, ArrayList<Integer> list, int nFact)
    {
        if(list.size() == total-1)
        {
            list.add(nums.get(0));

            for(int x : list){
                ans+= x;
            }
        }

        int nMinusOneFact=1;
        if(n!=0)
            nMinusOneFact = nFact/n;


        for(int group = 0; group<n; group++)
        {
            if(k <= (group+1)*nMinusOneFact)
            {
                list.add(nums.get(group));
                nums.remove(group);
                System.out.println(nMinusOneFact);
                kth(total, n-1, k - group*nMinusOneFact, nums, list, nMinusOneFact);
                break;
            }

        }
    }

    public String getPermutation(int n, int k) {

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=1; i<=n; i++)
        {
            nums.add(i);
        }

        int nMinusOneFact = 1;
        for(int i=n; i>0; i--)
        {
            nMinusOneFact *= i;
        }

        System.out.println(nMinusOneFact);

        kth(n, n, k, nums, new ArrayList<Integer>(), nMinusOneFact);
        return ans;
        
    }
}