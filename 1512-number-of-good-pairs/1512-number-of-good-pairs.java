class Solution {
    public int numIdenticalPairs(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
            int temp=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==0){temp+=0;}
                else if(nums[j]==nums[i]){nums[j]=0;temp++;}
                }
            tot+=((temp*(temp-1))/2);
        }
        return tot;
    }
}