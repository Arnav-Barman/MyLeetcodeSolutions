class Solution {
    void reverse_range(int[] arr, int i, int j) {
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if (nums.length <= 1)
            return;
        reverse_range(nums, 0, nums.length-1);
        reverse_range(nums, k, nums.length-1);
        reverse_range(nums, 0, k-1);
    }
}
//     public static void rotate(int[] nums, int k) {
//     if(1>nums.length||nums.length>100000||0>k||k>100000){return;}
//             for (int i = 0; i < k; i++) {
//                  if(Integer.MIN_VALUE>nums[i]||nums[i]>Integer.MAX_VALUE){return;}
//                 int temp=nums[nums.length-1];
//                 for (int j = nums.length-1; j > 0; j--) {
//                     nums[j]=nums[j-1];
//                 }
//                 nums[0]=temp;
            
//             System.out.println(nums.length);}
// }
//}