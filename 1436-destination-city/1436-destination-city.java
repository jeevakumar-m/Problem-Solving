class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> mm=new HashMap<String,String>();
        
        for(List<String> a:paths)
        {
            mm.put(a.get(0),a.get(1));    
        }
        System.out.println(mm);
        String temp=paths.get(0).get(0);
            System.out.println(temp);
        while(mm.containsKey(temp))
        {
            temp=mm.get(temp);
            System.out.println(temp);
        }
        
        return temp;
            
    }
}