class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> wordMap= new HashMap<Character,String>();
        String[] wordArr=s.split(" ");
        int i=0;
        if(wordArr.length!=pattern.toCharArray().length)
        {
            return false;
        }
        
        for(Character c: pattern.toCharArray())
        {
            
            if(wordMap.containsKey(c))
            {
                System.out.println("pattern:"+c);
                System.out.println("map:"+wordMap);
                System.out.println("split word:"+wordArr[i]);
                if(!wordMap.get(c).equals(wordArr[i]))
                {
                    return false;
                }
            }
            else
            {
                if(wordMap.containsValue(wordArr[i]))
                {
                    return false;
                }
                wordMap.put(c,wordArr[i]);
            }
            
            i++;
        }
        
        return true;
    }
}