class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] r, int[][] b) {
        List<List<Integer>> red=new ArrayList<>();
        List<List<Integer>> blue=new ArrayList<>();
        for(int i=0;i<n;i++){
            red.add(new ArrayList<>());
            blue.add(new ArrayList<>());
        }
        for(int arr[]:r){
            red.get(arr[0]).add(arr[1]);
        }
        for(int arr[]:b){
            blue.get(arr[0]).add(arr[1]);
        }
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        boolean[][] vis=new boolean[n][2];
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0));
        q.add(new Pair(0,1));
        vis[0][0]=vis[0][1]=true;
        ans[0]=0;
        int d=0;
        while(!q.isEmpty()){
            int size=q.size();
            d++;
            while(size-->0){
                Pair x=q.poll();
                if(x.c==0){
                    for(int i:red.get(x.v)){
                        if(!vis[i][0]){
                            q.add(new Pair(i,1));
                            vis[i][0]=true;
                            if(ans[i]==-1) ans[i]=d;
                        }
                    }
                }else{
                    for(int i:blue.get(x.v)){
                        if(!vis[i][1]){
                            q.add(new Pair(i,0));
                            vis[i][1]=true;
                            if(ans[i]==-1) ans[i]=d;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
class Pair{
    int v;
    int c;
    Pair(int v,int c){
        this.v=v;
        this.c=c;
    }
}