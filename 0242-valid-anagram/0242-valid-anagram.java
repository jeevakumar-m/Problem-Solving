class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> smap=new HashMap<Character,Integer>();
        Map<Character,Integer> tmap=new HashMap<Character,Integer>();
        
        if(s.length()==t.length())
        {
        for(int i=0;i<s.length();i++)
        {
            if(smap.containsKey(s.charAt(i)))
            {
                smap.put(s.charAt(i),smap.get(s.charAt(i))+1);
            }
            else
            {
                smap.put(s.charAt(i),1);
            }
        }
        
        System.out.println(smap);
        
        for(int i=0;i<t.length();i++)
        {
            if(tmap.containsKey(t.charAt(i)))
            {
                tmap.put(t.charAt(i),tmap.get(t.charAt(i))+1);
            }
            else
            {
                tmap.put(t.charAt(i),1);
            }
        }
        
         System.out.println(tmap);
        
        for(Map.Entry<Character,Integer> test:smap.entrySet())
        {
            int keyValue=test.getValue();
            int cmpValue=tmap.get(test.getKey())==null?0:tmap.get(test.getKey());
            if(keyValue!=cmpValue)
            {
                return false;
            }
        }
        }
        else
        {
            return false;
        }
        
        return true;
    }
}