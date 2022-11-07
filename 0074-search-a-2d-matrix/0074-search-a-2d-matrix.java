class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int left = 0;
        int right = rows*columns-1; //end pointer
        
        while(left<=right){
            int mid = left + (right-left)/2;
            
            if(matrix[mid/columns][mid%columns]==target){ //Imagine 2d matrix as 1d and place imaginary continuous index
                return true;
            }else if(matrix[mid/columns][mid%columns]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        
        return false;
        
    }
}