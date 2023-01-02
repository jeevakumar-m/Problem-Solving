class Solution {
    public int firstMissingPositive(int[] nums) {
        int j=1;
        int k=0;
        Arrays.sort(nums);
        for(int i:nums)
        {
            if(i>0)
            {
            if(i!=k)
            {
                if(i!=j)
                {
                    break;
                }
               
                    j++;
                }
                k=i;
            }
            
        }
        return j;
    }
}