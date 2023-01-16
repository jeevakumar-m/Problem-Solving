class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr= new HashSet();

        HashMap<Integer,Integer> kk=new HashMap<Integer,Integer>();
        for(int i:nums1)
        {
            kk.put(i,1);         
        }

        for(int j:nums2)
        {
            if(kk.containsKey(j))
            {
                arr.add(j);
            }
        }
       
        int[] c= new int[arr.size()];
        int k=0;
        for(int jj:arr)
        {
            c[k]=jj;
            k++;
       }
        
        return c;
    }
}