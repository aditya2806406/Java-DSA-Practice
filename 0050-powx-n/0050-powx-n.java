
class Solution {
    public static double myPow(double x, int n) {
        long p = n;
        if (p < 0) p = -p;

        double ans = 1.0;

        while (p > 0) {
            if ((p & 1) == 1) ans *= x;
            x *= x;
            p >>= 1;
        }

        return n < 0 ? 1.0 / ans : ans;
    }




    public static void main(String[] args){
        System.out.println(myPow(32,5));
          System.out.println(myPow(32,-5));
    }
}