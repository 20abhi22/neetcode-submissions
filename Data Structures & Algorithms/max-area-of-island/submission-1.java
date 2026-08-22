class Solution {

    // public static int maxArea =0;

    public int maxdfs(int i,int j,int grid[][],boolean visited[][],int currentMax){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||visited[i][j]||grid[i][j]==0) return currentMax;

        visited[i][j] = true;
        currentMax++;

        currentMax=maxdfs(i,j-1,grid,visited,currentMax);
        currentMax=maxdfs(i,j+1,grid,visited,currentMax);
        currentMax=maxdfs(i-1,j,grid,visited,currentMax);
        currentMax=maxdfs(i+1,j,grid,visited,currentMax);

        return currentMax;

    }




    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea=0;

        

        boolean[][] visited = new boolean[n][m];

        for(boolean[] row : visited){
            Arrays.fill(row,false);
        }

        for(int i=0;i< n;i++ ){
            //  currentMax=0;
            for(int j=0;j<m;j++){
                if(!visited[i][j]&&grid[i][j]==1){
                
                int currentMax=maxdfs(i,j,grid,visited,0);
                maxArea = Math.max(currentMax, maxArea);
                }
            }
            // maxArea = Math.max(currentMax, maxArea);
        }

        return maxArea;
        
    }
}
