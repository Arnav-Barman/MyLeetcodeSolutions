class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
    if(0>nums.length||nums.length>100000 ||target<-1000000000 ||target>1000000000){return null;}
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>1000000000||nums[i]<-1000000000){return null;}
            if (nums[i]>nums[i+1]) {return null;}
        }
        if (nums.length == 0) {
            ans[0]=-1;ans[1]=-1;return ans;
        }
        for (int i = 0; i < nums.length; i++) {
            if(target==nums[i]){ans[0]=i;ans[1]=i;break;}
            else {ans[0]=-1;ans[1]=-1;}
        }
        for (int i = ans[0]+1; i <nums.length ; i++) {
            if(target==nums[i]){ans[1]=i;}
        }
    return ans;
    }
}