class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int z=0;
        int t=n-1;
        for(int i=0;i<n;i++){
                while (nums[i]==2 && i<t) 
                    swap(nums,i,t--);
                while (nums[i]==0 && i>z) 
                    swap(nums,i,z++);
        }
    }
    public void swap(int[] nums, int i, int j) {
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
    }
}