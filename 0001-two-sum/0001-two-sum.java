class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        HashMap<Integer,Integer> countMap= new HashMap<Integer,Integer>();
        int fi=0,li=0;
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(countMap.containsKey(target-nums[i]))
            {
                fi=i;
                li=countMap.get(target-nums[i]);
                break;
            }
            else
            {
                countMap.put(nums[i],i);
            }
        }
        
        return new int[]{fi,li};
    }
}