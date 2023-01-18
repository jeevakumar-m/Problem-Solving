class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
        
        int k=nums.length-1;
        int p1=nums[k]*nums[k-1]*nums[k-2];
        int n1=nums[0]*nums[1]*nums[k];
        
        return (p1<n1?n1:p1);
    }
}