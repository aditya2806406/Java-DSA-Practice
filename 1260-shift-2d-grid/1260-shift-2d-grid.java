class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=0;
        int m=grid[0].length;
        int s=grid.length;
        int h=0;
        while(h<k){
             int[][] mat=new int[grid.length][grid[0].length];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(i==s-1 && j==m-1){
                        mat[0][0]=grid[i][j];
                    }
                   
                       else{
                        mat[(n+1)/m][(n+1)%m]=grid[i][j];
                        n++;
                    }
                }

            }
            grid=mat;
            h++;
            n=0;
        }
       
        
    
    List<List<Integer>>ans=new ArrayList<>();
    for(int i=0;i<s;i++){
         List<Integer> list = new ArrayList<>();
           for(int j=0;j<m;j++){
            list.add(grid[i][j]);

           }
         ans.add(list);
    }
    return ans;
}}