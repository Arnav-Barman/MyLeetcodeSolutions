class Solution {
    public int[] sumZero(int n) {
        if (n>1000||n<1) {return null;}
        int[] arr = new int[n]; int x=1;
        if(n%2==0){
            for (int i = 0; i < n; i+=2) {
                arr[i]=x;
                arr[i+1]=-x;
                x++;
            }
        }
        else{
            arr[0]=0;
            for (int i = 1; i < n; i+=2) {
                arr[i]=x;
                arr[i+1]=-x;
                x++;
            }}
    return arr;
    }
}