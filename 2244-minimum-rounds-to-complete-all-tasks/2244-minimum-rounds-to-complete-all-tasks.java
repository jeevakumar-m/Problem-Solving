class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> mmr= new HashMap<Integer,Integer>();

        for(int i=0;i<tasks.length;i++)
        {
            if(mmr.containsKey(tasks[i]))
            {
                mmr.put(tasks[i],mmr.get(tasks[i])+1);
            }
            else
            {
                mmr.put(tasks[i],1);
            }
        }
        
        System.out.println(mmr);
        
        int c=0;
        int incfactor=0;
        
        for(Map.Entry<Integer,Integer> mm:mmr.entrySet())
        {
           
           int k=mm.getValue(); 
            
           if(k!=1)
           {c+=k/3;
           c+=(k%3!=0)?1:0;
           }
           else
           {
               c=-1;
               break;
           }
            
            
        }
        
        return c;
    }
}