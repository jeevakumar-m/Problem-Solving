class Solution {
    public int maxPoints(int[][] points) {
 int maxPoints = -1;
        
        for(int i = 0; i < points.length; i++)
        {
            Map<Double, Integer> map = new HashMap<>();
            int sameX = 1, samePoints = 0;
            
            for(int j = 0; j < points.length; j++)
            {
                if(i == j) continue;

                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                if(x1 == x2 && y1 == y2) samePoints++;
                
                if(x1 == x2) 
                {
                    sameX++; 
                    continue;
                }
                
                double slope = (double) (y2 - y1) / (double) (x2 - x1);
                
                if(map.containsKey(slope))
                {
                    map.put(slope,map.get(slope) + 1);
                }
                else
                {
                    map.put(slope, 2);
                }
                
                maxPoints = Math.max(maxPoints, map.get(slope) + samePoints);
            }
            
            maxPoints = Math.max(maxPoints, sameX);
        }
        
        
        return maxPoints;
    }
}