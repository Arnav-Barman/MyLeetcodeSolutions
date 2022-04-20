class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if((m*n)!=(r*c) || (m==r && n==c))
            return mat;
        int[][] resh = new int[r][c];
        int k =m*n;
        int[] val = new int[k];
        k=0;
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                val[k]=mat[i][j];
                k++;
            }
        }
        k=0;
        for (int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                resh[i][j]=val[k];
                k++;
            }
        }
        return resh;
    }
}