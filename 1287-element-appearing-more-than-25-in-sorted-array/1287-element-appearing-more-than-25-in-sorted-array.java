class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> mm= new HashMap<Integer,Integer>();
        
        Double limit=arr.length*0.25;
        
        for(int i:arr)
        {
            if(mm.containsKey(i))
            {
                mm.put(i,mm.get(i)+1);
            }
            else
            {
                mm.put(i,1);
            }
        }
        
        int retValue=0;
        
        for(Map.Entry<Integer,Integer> m:mm.entrySet())
        {
            System.out.println(m.getValue());
            if(m.getValue()>=limit)
            {
                retValue= m.getKey();
            }
        }
        
        
        return retValue;
    }
}