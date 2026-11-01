class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] grid=new int[r][c];
        int m=mat.length;
        int n=mat[0].length;
        int initial=m*n;
        int finish=r*c;
        if(initial!=finish){
            return mat;
        }
        int k=0;
        if(initial==finish){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[k/c][k%c]=mat[i][j];
                System.out.print(grid[k/c][k%c]+ " ");
                    k++;
              

            }
            System.out.println();
        }
        }
          return grid;
    }
}