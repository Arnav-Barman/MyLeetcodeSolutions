class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int[] count = new int[4];
        for(int x[] : indices){
            row[x[0]]++;
            col[x[1]]++;
        }
        for(int i =0; i<m;i++){
            if(row[i]%2==0)
                count[0]++;
            else
                count[2]++;
        }
        for(int i =0; i<n;i++){
            if(col[i]%2==0)
                count[1]++;
            else
                count[3]++;
        }
        int sum = (count[0]*count[1])+(count[2]*count[3]);
        return (m*n)-sum;
    }
}