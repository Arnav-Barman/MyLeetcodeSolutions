class Solution {
    public int reverse(int n) {
       int res=0,p_res=0;
        if(n<0){
            n=n*-1;
        while(n>0){
            res=(res*10)+(n%10);
            
            if ((res - (n%10))/10 != p_res)
            {
                return 0;
            }
            p_res = res;
            
            n/=10;
        }
            res=res*-1;
        }
        else{
            while(n>0){
            res=(res*10)+(n%10);
            
            if ((res - (n%10))/10 != p_res)
            {
                return 0;
            }
            p_res = res;
            
            n/=10;
        }
        }
        return res; 
    }
}