class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        int j=1;
        for(String i:s)
        {
            if(i.indexOf(searchWord)==0) 
            {
                return j;
            }
            j++;
        }
        
        return -1;
        
    }
}