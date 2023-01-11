class Solution {
    public boolean squareIsWhite(String coordinates) {
        int row=coordinates.charAt(0)-96;
        int col=Integer.valueOf(coordinates.charAt(1));
        
        boolean isEven1=row%2==0;
        boolean isEven2=col%2==0;
        
       if((isEven1 && !isEven2) || (!isEven1 && isEven2))
       {
           return true;
       }
        
        return false;
    }
}