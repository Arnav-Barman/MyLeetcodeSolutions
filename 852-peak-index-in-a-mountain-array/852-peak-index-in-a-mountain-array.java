class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0, e=arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m] > arr[m+1] && arr[m] > arr[m-1])
                return m;
            else if(arr[m] < arr[m+1] && ( m == 0 || arr[m] > arr[m-1] ) )
                s = m+1;
            else if( ( m==arr.length ||arr[m] > arr[m+1]) && arr[m] < arr[m-1])
                e = m-1;
        }
        return -1;
    }
}