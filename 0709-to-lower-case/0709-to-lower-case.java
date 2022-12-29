class Solution {
    public String toLowerCase(String s) {
        int lowerStart=97;
        int lowerEnd=122;
        int upperStart=65;
        int upperEnd=90;
        String retVal="";
        for(char c:s.toCharArray())
        {
            if(c>64 && c<91)
            {
                retVal+=String.valueOf((char)((c-upperStart)+lowerStart));
            }
            else
            {
                retVal+=String.valueOf(c);
            }
            
        }
        return retVal;
    }
}