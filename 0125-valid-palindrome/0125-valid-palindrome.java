class Solution {
    public boolean isPalindrome(String s) {
        //clean string
        s=s.toLowerCase();
        String k="";
        String j="";
        for(char c:s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                k+=c;
            }
        }
        
        for(int l=k.length()-1;l>=0;l-- )
        {
            j+=String.valueOf(k.charAt(l));
        }
        
        System.out.println(k);
        System.out.println(j);
        
        return j.equals(k);
        
        
    }
}