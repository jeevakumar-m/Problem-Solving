class Solution {
    public String capitalizeTitle(String title) {
        String k="";
        for(String s:title.split(" "))
        {
            System.out.println(s);
            if(s.length()==1 || s.length()==2)
            {
                k+=s.toLowerCase()+" ";           
            }
            else
            {
                                                     k+=String.valueOf(s.charAt(0)).toUpperCase()+s.toLowerCase().substring(1,s.length())+" ";
            }
            
        }
        
        System.out.println(k);
        return k.substring(0,k.length()-1);
    }
}