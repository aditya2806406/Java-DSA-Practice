class Solution {
    public static int numIslands(char[][] grid) {
        int count=0;
      int m=grid.length;
      int n=grid[0].length;
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]=='1'){
                count++;
                dfs(grid,i,j);
            }
        }
      }
      return count;
    }

    public static void dfs(char[][] matrix,int i,int j){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length || matrix[i][j]=='0'){
            return;
        }
        matrix[i][j]='0';
        dfs(matrix, i,j+1);
        dfs(matrix,i+1,j);
        dfs(matrix,i-1,j);
        dfs(matrix,i,j-1);
    }
     
}