class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int k=0;
        int[][] grid=new int[m][n];
        if(m*n!=original.length){
            return new int[0][0];
        }        
        if(m*n==original.length){
            for(int i=0;i<original.length;i++){
                grid[k/n][k%n]=original[i];
                k++;
               
            }
        }
        return grid;
    }
}