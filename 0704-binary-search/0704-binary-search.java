class Solution {
    public int search(int[] nums, int target) {
       int l=0;
       int r=nums.length-1;
        
       while(r-l>1)
       {
           int m=(l+r)/2;
           if(nums[m]<target)
               l=m+1;
           else
               r=m;
       }

       if(nums[l]==target){return l;}
       else if(nums[r]==target){return r;}
       else { return -1;}
    }
}