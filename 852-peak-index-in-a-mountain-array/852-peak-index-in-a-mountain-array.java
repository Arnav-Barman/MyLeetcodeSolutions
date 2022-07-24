class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int s, e, m;
        s=0;
        e=n-1;
        if(n<3)
            return -1;
        while(s<=e){
            m = s + (e-s)/2;
            if(arr[m] > arr[m+1] && arr[m] > arr[m-1])
                return m;
            else if(arr[m] < arr[m+1] && ( m == 0 || arr[m] > arr[m-1] ) )
                s = m+1;
            else if( ( m==n ||arr[m] > arr[m+1]) && arr[m] < arr[m-1])
                e = m-1;
        }
        return -1;
    }
}