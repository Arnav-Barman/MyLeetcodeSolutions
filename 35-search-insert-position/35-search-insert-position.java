class Solution {
    public int searchInsert(int[] nums, int target) {
        int s=0, e=nums.length-1, m;
        while(s<e){
            m=s+(e-s)/2;
            if(nums[m]==target)
                return m;
            else if(nums[m]>target)
                e=m;
            else
                s=m+1;
        }
        return nums[s]<target ? s+1 : s;
    }
}