class Solution {

    public void dfs(int n,List<List<Integer>> adj , boolean[] visited){
        visited[n]=true;
        for(int neighbour : adj.get(n)){
            if(!visited[neighbour])dfs(neighbour,adj,visited);
        }
    }


    public int countComponents(int n, int[][] edges) {
        boolean[] visited= new boolean[n];
        Arrays.fill(visited,false);

       List<List<Integer>> adj = new ArrayList<>();
        for(int j=0;j<n;j++) adj.add(new ArrayList<>());
        int components=0;

        for(int[] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                components++;
            }
        }
        return components;
    }
}
