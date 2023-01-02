class Solution {
    public int findDuplicate(int[] nums) {
        int prev=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(prev==nums[i])
            {
                return nums[i];
            }
            prev=nums[i];
        }
        
        return 0;
    }
}