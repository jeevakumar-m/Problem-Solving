class Solution {
    public int minDeletionSize(String[] strs) {
        int prev=10;
        int c=0;
        for(int i=0;i<strs[0].length();i++)
        {
            System.out.println("next column");
            prev=0;
            for(int j=0;j<strs.length;j++)
            {
                System.out.println(String.valueOf(strs[j].charAt(i)) + "," + (char)prev);
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