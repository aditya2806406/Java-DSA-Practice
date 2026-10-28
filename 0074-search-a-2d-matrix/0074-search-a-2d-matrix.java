class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;
         while(low<=high){
        int mid=(low+high)/2;
        int m=mid/col;
        int n=mid%col;
        if(matrix[m][n]==target){
            return true;

        }else if(matrix[m][n]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
         }
         return false;



       
    }
    public static void main(String[] args){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=5;
        System.out.println(searchMatrix(matrix,target));
        
    }
}