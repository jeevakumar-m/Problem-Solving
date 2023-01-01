class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        int n=a.length;
        String temp="";
        for(int i=n-1;i>=0;i--)
        {
            if(!a[i].equals(""))
            {
                temp+=a[i]+" ";
            }
        }
        
        return temp.substring(0,temp.length()-1);
    }
}