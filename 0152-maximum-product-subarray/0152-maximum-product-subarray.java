class Solution {
    public int maxProduct(int[] nums) {
        int currProd=1;
        int maxProd=Integer.MIN_VALUE;
        
        for(int i:nums)
        {
            currProd*=i;
            maxProd=(currProd>maxProd)?currProd:maxProd;
            currProd=(currProd==0)?1:currProd;
        }
        currProd=1;
        for(int k=nums.length-1;k>=0;k--)
        {
            currProd*=nums[k];
            maxProd=(currProd>maxProd)?currProd:maxProd;
            currProd=(currProd==0)?1:currProd;
        }
        
        return maxProd;
    }
}