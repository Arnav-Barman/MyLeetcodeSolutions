class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] naya = new int[nums.length];
    if(2 > nums.length|| nums.length > 500){return null;}
       for (int i = 0; i < nums.length; i++) {
           if(0 > nums[i] ||nums[i]> 100){return null;}
           int count =0;
           for (int j = 0; j < nums.length; j++) {
               if(nums[i]>nums[j]){count++;}
           }
           naya[i]=count;
        }
       return naya;
    }
}