class Solution {
    public int findLUSlength(String a, String b) {
        if(a.contains(b))
        {
            if(!b.contains(a))
            {
                return a.length();
            }
        }
        else if(b.contains(a))
        {
            if(!a.contains(b))
            {
                return b.length();
            }

        }
        else
        {
            return b.length()>a.length()?b.length():a.length();
        }

        return -1;
    }
}