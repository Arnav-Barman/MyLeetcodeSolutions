class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s = matrix[0].length-1;
        int e = 0;
        while (s>=0 && e<matrix.length){
            if (matrix[e][s]<target)
                e++;
            else if (matrix[e][s]>target)
                s--;
            else
                return true;
        }
        return false;
            
    }
}