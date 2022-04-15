class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length ;
        int[][] naya= new int[(matrix[0].length)][m];

        for (int i = 0; i <m ; i++) {
            int n=matrix[i].length;
            if(1>m||1>n||1>(m*n)||m>1000||n>1000||(m*n)>100000){return null;}
            for (int j = 0; j < n; j++) {
                if(-1000000000>matrix[i][j]||matrix[i][j]>1000000000){return null;}
                naya[j][i]=matrix[i][j];
            }

        }
    return naya;
    }
}