class Solution {
   public static boolean isToeplitzMatrix(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        for (int i = 0; i < rowLen -1 ; i++) {
            for (int j = 0;  j < colLen -1; j++ ) {
                if(matrix[i][j] != matrix[i +1][j +1])return false;
            }
        }
        return true;
    }
}