class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i:nums)
        {
            currSum+=i;
            maxSum=(currSum>maxSum)?currSum:maxSum;
            currSum=(currSum<0)?0:currSum;
        }
        
        return maxSum;
    }
}