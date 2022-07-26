class Solution {
    public boolean isGoodArray(int[] A) {
        int x = A[0], y;
        for (int a: A) {
            while (a > 0) {
                y = x % a;
                x = a;
                a = y;
            }
        }
        return x == 1;
    }
}


/*

Solve using Bezouts identity 
            ax+by=d for any a,b,x,y,d when gcd(a,b)=d

*/