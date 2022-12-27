class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> decoder=new HashMap<Character,Character>();
        int i=97;
        for(char c:key.toCharArray())
        {
            if(!decoder.containsKey(c) && c!=' ')
                {
                    decoder.put(c,(char)i);
                    i++;
                }
        }

        String decodedMessage="";
        for(char k:message.toCharArray())
        {
            if(k!=' ')
            {   decodedMessage+=decoder.get(k);
            }
            else
            {
                decodedMessage+=" ";
            }
        }
        System.out.println(decoder);
        return decodedMessage;
    }
}