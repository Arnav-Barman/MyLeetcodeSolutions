class Solution {
    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        if(length<1||length>500000) {return -1;}
        int min=1;
        Arrays.sort(nums);   
        for (int i = 0; i < length; i++) {
             if(nums[i]<Integer.MIN_VALUE||nums[i]>Integer.MAX_VALUE){return -1;}
            if(min==nums[i]){min++;}
        }
        return min;}
}