class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int cSum=0;
        int mxSum=Integer.MIN_VALUE;
        int miSum=Integer.MAX_VALUE;
        
        for(int i:nums)
        {
            cSum+=i;
            mxSum=Math.max(cSum,mxSum);
            cSum=cSum<0?0:cSum;
        }
        
        cSum=0;
        for(int i:nums)
        {
            cSum+=i;
            miSum=Math.min(cSum,miSum);
            cSum=cSum>0?0:cSum;
        }
      
      
        return Math.max(Math.abs(miSum),Math.abs(mxSum));
        
        
    }
}