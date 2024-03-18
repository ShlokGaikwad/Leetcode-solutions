class Solution {
    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        Map<Integer, List<Integer[]>> graph = new HashMap<>();
        
        for(int edge[] : edges){
            int src = edge[0];
            int des = edge[1];
            int weight = edge[2];
            
            if(!graph.containsKey(src)){
                graph.put(src, new ArrayList<>());
            }
            
            if(!graph.containsKey(des)){
                graph.put(des, new ArrayList<>());
            }
            
            graph.get(src).add(new Integer[]{des, weight});
            graph.get(des).add(new Integer[]{src, weight});
        }

        int n = graph.size();
        
        int ans[] = new int[graph.size()];
        for(Map.Entry<Integer, List<Integer[]>> it : graph.entrySet()){
            int node = it.getKey();

            if(it.getValue().size() == 1) continue;
            
            int sum = 0;
            int counts[] = new int[n];
            for(Integer[] neighbors : it.getValue()){
                int des = neighbors[0];
                int weight = neighbors[1];

                boolean visited[] = new boolean[n];
                visited[node] = true;

                int count = dfs(des, weight, signalSpeed, graph, visited);

                counts[des] = count;
                sum += count;
            }

            // System.out.println(node + ": " + Arrays.toString(counts));

            int a = 0;
            for(int count : counts){
                if(count != 0){
                    a += count * (sum - count);
                }
            }

            ans[node] = a / 2;
        }
        
        return ans;
    }

    public int dfs(int src, int weight, int signalSpeed, Map<Integer, List<Integer[]>> graph, boolean visited[]){
        visited[src] = true;
        int count = 0;

        if(weight % signalSpeed == 0){
            count++;
        }

        for(Integer[] neighbors : graph.get(src)){
            int des = neighbors[0];
            int eW = neighbors[1];

            if(visited[des] == false){
                count += dfs(des, weight + eW, signalSpeed, graph, visited);
            }

        }
        return count;
    }
}