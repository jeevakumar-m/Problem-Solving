class Solution {
    public String reverseVowels(String s) {
        Stack<Character> lc= new Stack<Character>();
        String k="";
        for(Character c:s.toCharArray())
        {
            if(c=='a' || c=='e' || c=='o' || c=='i' || c=='u'
              ||c=='A' || c=='E' || c=='O' || c=='I' || c=='U'
              )
            {
                lc.push(c);
                k+="~";
            }
            else
            {
                k+=String.valueOf(c);
            }
        }
        String j="";
        for(Character c:k.toCharArray())
        {
            if(c=='~')
            {
                if(!lc.isEmpty())
                j+=lc.pop();
            }
            else
            {
                j+=String.valueOf(c);
            }
        }
        
        return j;
    }
}