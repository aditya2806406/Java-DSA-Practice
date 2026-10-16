

class Solution {
    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;

        if (n < 0) {
            return 1.0 / myPow(x, -(n + 1)) / x;
        }

        double half = myPow(x, n / 2);

        if (n % 2 == 0)
            return half * half;

        return x * half * half;
    }




    public static void main(String[] args){
        System.out.println(myPow(32,5));
          System.out.println(myPow(32,-5));
    }
}