class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(n<1||n>500){return null;}
        if(nums.length!=2*n){return null;}
        
    int[] naya = new int[nums.length];
        for (int i = 0; i < n; i++) {
                if (1 > nums[i] || nums[i] > 1000) {
                    return null;
                }
                naya[2*i]=nums[i];
                naya[(2*i)+1]=nums[n+i];
            }
           return naya;
    }
}