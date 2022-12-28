class Solution {
    public int countPrefixes(String[] words, String s) {
        int j=0;
        for(String i:words)
        {
            if(s.indexOf(i)==0)
            {
                j++;
            }
        }
        
        return j;
    }
}