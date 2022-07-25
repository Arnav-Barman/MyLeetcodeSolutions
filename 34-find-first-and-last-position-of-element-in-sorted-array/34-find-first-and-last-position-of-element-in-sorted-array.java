class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};
        int s,e,m;
        s=0;
        e=arr.length-1;
        while(s<=e){
            m=s+(e-s)/2;
            if (arr[m]>=target)
                e=m-1;
            else
                s=m+1;
            if(arr[m]==target)
                ans[0]=m;
        }
        s=0;
        e=arr.length-1;
        while(s<=e){
            m=s+(e-s)/2;
            if(arr[m]<=target)
                s=m+1;
            else
                e=m-1;
            if(arr[m]==target)
                ans[1]=m;
        }
        return ans;
    }
}