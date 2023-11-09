class Solution {
    public double myPow(double x, int n) {
        if(n == Integer.MIN_VALUE){
            x = x*x;
            n = n/2;
        }
        if(n<0){
            x = 1/x;
            n = n*(-1);
        }
        double result = 1.0;
        while(n>0){
            if(n%2 != 0){
                result = result * x;
            }
            x = x * x;
            n = n/2;
        }
        return result;
    }
}