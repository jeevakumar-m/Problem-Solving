class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> mm= new HashMap<Integer,Integer>();
        int sum=0;
        for(int i:nums)
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
        
        for(Map.Entry<Integer,Integer>k:mm.entrySet())
        {
            if(k.getValue()<2)
            {
                sum+=k.getKey();
            }
        }
        
        return sum;
    }
}