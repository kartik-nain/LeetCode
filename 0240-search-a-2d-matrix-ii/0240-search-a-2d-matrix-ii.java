class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //First, We place our pointer at last element of first row
        int i = 0; //i is row number
        int j = matrix[0].length-1; //j is column number
        
        while(i<matrix.length && j>=0){ //we will increment i which can't exceed row index and decrement j can't become less than column index
            
            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--; //Decrement column number because value will be smaller there
            }else{
                i++; //increase row number because value will be larger there
            }
            
        }
        
        return false;
    }
}