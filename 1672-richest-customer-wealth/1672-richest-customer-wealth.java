class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int[] sum= new int[m];
        if(m<1 || m>50){return -1;}
        else{
        for (int i = 0; i <m ; i++) {
            int n = accounts[i].length;
            int x =0;
            if(n<1 || n>50){return -1;}
        else{
            for (int j = 0; j <n ; j++) {
             if(accounts[i][j]<1 || accounts[i][j]>100){return -1;}
                else{
                x+=accounts[i][j];}
            }}
            sum[i]=x;
        }
        int max=sum[0];
        for (int i = 0; i < sum.length; i++) {
            if(sum[i]>max){
                max=sum[i];
            }
        }
        return max;}
    }
}