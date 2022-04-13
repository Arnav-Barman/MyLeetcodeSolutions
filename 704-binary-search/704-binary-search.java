class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s=0, e=n-1;
        if(n<1||n>10000||target>10000||target<-10000){return -1;}
        for(int i=0;i<n;i++){
            if(nums[i]>10000||nums[i]<-10000){return -1;}
            }
        while (s<=e){
            int m=s+(e-s)/2;
            if(target>nums[m]){s=m+1;}
            else if(target<nums[m]){e=m-1;}
            else if(target==nums[m]){return m;}
        }
        return -1;
    }
}