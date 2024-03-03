class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer>list=new ArrayList<>();
        int l=a.length();
        int temp=0;
        int index1=0;
        int al=0;
        int n=s.length();

        while(temp!=-1){
            index1=s.indexOf(a,temp);
            int index2=s.indexOf(b,index1-k);
            if(index1==-1 || index2==-1)return list;
            if(Math.abs((index1)-(index2))<=k){
               list.add(index1);
            }
            
            temp=index1+1;
            
        }
        return list;
    }
}