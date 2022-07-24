class Solution {
    public int search(int[] nums, int target) {
        int s,m,e,n;
        n = nums.length;
        s = 0;
        e = n-1;
        while (s<=e){
            m = s + (e-s)/2;
            if(target>nums[m])
                s = m+1;
            else if (target<nums[m])
                e = m-1;
            else if (target==nums[m])
                return m;
        }
        return -1;
    }
}
