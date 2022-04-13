class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n= image.length;
        int[][] out = new int[n][n];
        if(1>n||n>20){return null;}
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out[i][n-j-1]=image[i][j];
                if(out[i][n-j-1]==0){out[i][n-j-1]=1;}
                else{out[i][n-j-1]=0;}
            }
        }
        return out;
    }
}