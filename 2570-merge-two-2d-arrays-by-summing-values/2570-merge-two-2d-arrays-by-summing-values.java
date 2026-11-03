class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       int[][] grid=new int[nums1.length+nums2.length][2];
       int k=1;
       int i=0;
       int j=0;
       int l=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i][0]==nums2[j][0]){
            grid[l][0]=nums1[i][0];
            grid[l][k]=nums1[i][k]+nums2[j][k];
            i++;
            j++;
            l++;
        }
       else if(nums1[i][0]>nums2[j][0]){
              grid[l][0]=nums2[j][0];
             grid[l][k]=nums2[j][k];
             j++;
             l++;
        }
        else {
             grid[l][0]=nums1[i][0];
            grid[l][k]=nums1[i][k];
            i++;
            l++;
        }
       }

        
    
    while(i<nums1.length){
         grid[l][0]=nums1[i][0];
        grid[l][k]=nums1[i][k];
        i++;
        l++;
    }
    while(j<nums2.length){
         grid[l][0]=nums2[j][0];
        grid[l][k]=nums2[j][k];
        j++;
        l++;
    }
   return java.util.Arrays.copyOf(grid, l);
    }
}