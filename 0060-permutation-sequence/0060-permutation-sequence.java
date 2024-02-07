class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> a=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int path[]=new int[n];
        sol(ans,a,n,k,path);
        List<Integer> t=ans.get(k-1);
        String s="";
        for(int i=0;i<t.size();i++){
            s=s+Integer.toString(t.get(i));
        }
        return s;
    }
    public void sol(List<List<Integer>> ans,List<Integer> a,int n,int k,int[] path){
        if(a.size()==n){
            ans.add(new ArrayList<>(a));
            return ;
        }
        if(ans.size()==k){
            return ;
        }
        for(int i=0;i<n;i++){
            if(path[i]==0){
                path[i]=1;
                a.add(i+1);
                sol(ans,a,n,k,path);
                a.remove(a.size()-1);
                path[i]=0;
            }
        }
    }
}