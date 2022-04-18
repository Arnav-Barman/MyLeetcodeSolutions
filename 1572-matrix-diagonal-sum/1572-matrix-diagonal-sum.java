class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum=0;
        int i=0, j=0;
        while(i<n && j<n){
            sum += mat[i][j];
            sum += mat[i][n-1-j];
            i++; 
            j++;
        }
        if(n%2 != 0 )
            sum -= mat[n/2][n/2];
        return sum;
    }
}