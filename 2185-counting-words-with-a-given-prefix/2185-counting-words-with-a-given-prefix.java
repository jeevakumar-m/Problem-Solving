class Solution {
    public int prefixCount(String[] words, String pref) {
        int j=0;
        
        for(String i : words)
        {
            if(i.indexOf(pref)==0)
            {
                j++;
            }
        }
        
        return j;
    }
}