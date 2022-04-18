class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    if(!x.contains(i))                    
                    x.add(i);
                    if(!y.contains(j))
                    y.add(j);
                }
            }
        }
        int i = x.size();
        int j= y.size();
        for(int a =0; a<i; a++){
            for(int b=0; b<n; b++)
            matrix[x.get(a)][b]=0;
        }
        for(int a=0; a<m; a++){
            for(int b=0; b<j; b++)
                matrix[a][y.get(b)]=0;
        }
    }
}