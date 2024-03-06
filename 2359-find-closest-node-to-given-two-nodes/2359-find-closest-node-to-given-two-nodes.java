class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int [n];
        int[] dist2 = new int [n];
        Arrays.fill(dist1,Integer.MAX_VALUE);
        Arrays.fill(dist2,Integer.MAX_VALUE);
        bfs(node1,edges,dist1);
        bfs(node2,edges,dist2);
       int minDistNode = -1, minDistTillNow = Integer.MAX_VALUE;
        for (int currNode = 0; currNode < n; currNode++) {
            if (minDistTillNow > Math.max(dist1[currNode], dist2[currNode])) {
                minDistNode = currNode;
                minDistTillNow = Math.max(dist1[currNode], dist2[currNode]);
            }
        }

        return minDistNode;




        
    }
     void bfs(int startNode,int [] edges, int[] dist){
         int n = edges.length;
         Queue<Integer> queue = new LinkedList();
         queue.offer(startNode);
         boolean[] visit = new boolean[n];
         dist[startNode] = 0;
         while(!queue.isEmpty()){
             int node = queue.poll();
             if(visit[node]){
                 continue;
                 
             }
             visit[node] = true;
             int neig = edges[node];
             if(neig!=-1&&!visit[neig]){
                 dist[neig] =1+dist[node];
                 queue.offer(neig);
             }
         }

     }

}