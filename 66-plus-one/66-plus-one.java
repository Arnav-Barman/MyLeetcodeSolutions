class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int count =0;
        for(int i=0; i<n; i++){
            if(digits[i]==9)
                count++;
        }
        int x=n;
        if(count==n)
            x++;    
        int[] ans = new int[x];
        if(digits[n-1]!=9){
            digits[n-1]++;
            return digits;
        }
        else if(count<n && count>0){
            for(int i = 0; i<x; i++)
                ans[i]=digits[i];
            ans[x-1]++;
            for(int i=x-1;i>0;i--){
            if(ans[i]==10){
                ans[i]=0;
                ans[i-1]++;
            }
        }
        }
        else{
            for(int i=1;i<x;i++)
                ans[i]=0;
            ans[0]=1;
        }
        return ans;
    }
}