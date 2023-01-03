class Solution {
    public int minDeletionSize(String[] strs) {
        
        int c=0;
        for(int i=0;i<strs[0].length();i++)
        {

            int prev=0;
            for(int j=0;j<strs.length;j++)
            {
              
                if(strs[j].charAt(i)<prev)
                {
                    
                    c++;
                    break;
                }
                prev=strs[j].charAt(i);
            }
        }
        return c;
    }
}