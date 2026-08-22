class Solution {
    void dfs(int i,int j,char grid[][], boolean vis[][]){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||vis[i][j]||grid[i][j] == '0') return ;

        vis[i][j]=true;

        dfs(i-1,j,grid,vis);
        dfs(i+1,j,grid,vis);
        dfs(i,j-1,grid,vis);
        dfs(i,j+1,grid,vis);
    }
    public int numIslands(char[][] grid) {
        int noIsland=0;
        int n = grid.length;
        int m= grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(boolean[] row:vis) Arrays.fill(row,false);

    for(int i=0;i<n;i++){
        for(int j=0;j< m;j++){
            if(vis[i][j]==false&&grid[i][j] == '1'){
                dfs(i,j,grid,vis);
                noIsland++;

            }

        }
    }
    return noIsland;
        
    }
}
