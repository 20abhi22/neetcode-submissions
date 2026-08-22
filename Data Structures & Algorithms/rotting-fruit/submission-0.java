class Solution {
    class Pair<U,V>{
        U first;
        V second;

        Pair(U first,V second){
            this.first= first;
            this.second= second;
        }

        
        
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean[][] visited = new boolean[n][m];

        Queue<Pair<Pair<Integer,Integer>,Integer>> queue= new LinkedList<>();
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair<>(new Pair<>(i,j),0));
                    visited[i][j]=true;
                }      
           }

        }
        int ans=0;

        while(!queue.isEmpty()){
            Pair<Pair<Integer,Integer>,Integer> current = queue.poll();
            int j=current.first.first;
            int k=current.first.second;
            int t=current.second;
            ans= Math.max(t,ans);

            if(j-1>=0&&!visited[j-1][k]&&grid[j-1][k]==1) {queue.offer(new Pair<>(new Pair<>(j-1,k),t+1)); visited[j-1][k]=true;}
            if(j+1<n&&!visited[j+1][k]&&grid[j+1][k]==1) {queue.offer(new Pair<>(new Pair<>(j+1,k),t+1)); visited[j+1][k]=true;}
            if(k-1>=0&&!visited[j][k-1]&&grid[j][k-1]==1) {queue.offer(new Pair<>(new Pair<>(j,k-1),t+1)); visited[j][k-1]=true;}
            if(k+1<m&&!visited[j][k+1]&&grid[j][k+1]==1) {queue.offer(new Pair<>(new Pair<>(j,k+1),t+1));visited[j][k+1]=true;}

        }

        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                if(grid[i][j]==1&&!visited[i][j]){
                    // queue.offer(new Pair<>(new Pair<>(i,j),0));
                    // visited[i][j]=1;
                    return -1;
                }      
           }
        }

        return ans;






        
    }
}
