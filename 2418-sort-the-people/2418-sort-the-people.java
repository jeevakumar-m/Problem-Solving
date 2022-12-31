class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer,String> mm= new HashMap<Integer,String>();
        for(int i=0;i<heights.length;i++)
        {
            mm.put(heights[i],names[i]);
        }
        
        Arrays.sort(heights);
        
        int k=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            names[k]=mm.get(heights[i]);
                k++;
        }
        
        return names;
        
    }
}