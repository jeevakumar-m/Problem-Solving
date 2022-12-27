class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words)
        {
            if(ispalindrome(s))
            {
                return s;
            }
        }
        
        return "";
    }
    
    public boolean ispalindrome(String c)
    {
        String d="";
        for(int i=c.length()-1;i>=0;i--)
        {
            d+=String.valueOf(c.charAt(i));
        }
        
        return d.equals(c);
    }
}