class Solution {
    public int missingNumber(int[] nums) {
        int i;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
            {
               return i;
            }
        }
        
        return nums.length;
    }
}