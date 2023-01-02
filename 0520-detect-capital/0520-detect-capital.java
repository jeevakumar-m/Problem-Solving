class Solution {

  
    public boolean detectCapitalUse(String word) {
          boolean flag1=true;
          boolean flag2=true;
          boolean flag3=true;
          char ch=word.charAt(0);
           if(ch>64 && ch<91)
           {
               flag2=false;
               
               for(int i=1;i<word.length();i++)
               {
                   ch=word.charAt(i);
                   if(!flag1 && !flag3)
                   {
                       break;
                   }
                   if(ch>64 && ch<91)
                   {
                      flag1&=true;
                      flag3&=false;
                   }
                   else
                   {
                       flag1&=false;
                       flag3&=true;
                   }
               }
           }
           else
           {
               flag1=false;flag3=false;
               for(int i=1;i<word.length();i++)
               {
                   ch=word.charAt(i);
                    if(!(ch>64 && ch<91))
                   {
                      flag2&=true;
                   }
                   else
                   {
                       flag2&=false;
                       break;
                   }
               }
           }

           return flag1 || flag2 || flag3;
          }
    }

    
