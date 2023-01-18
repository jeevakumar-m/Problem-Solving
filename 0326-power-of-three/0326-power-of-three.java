class Solution {
    public boolean isPowerOfThree(int n) {
        System.out.println(Math.round(Math.log(n)/Math.log(3)));
        return (Math.log10(n)/Math.log10(3))%1==0;
    }
}