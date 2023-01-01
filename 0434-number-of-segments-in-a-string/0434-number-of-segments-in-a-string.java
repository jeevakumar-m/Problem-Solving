class Solution {
    public int countSegments(String s) {
        int c=0;
        for(String k:s.split(" "))
        {
        
            if(k.length()!=0)
            {
                c++;
            }
        }
        return s.equals("")?0:c;
    }
}