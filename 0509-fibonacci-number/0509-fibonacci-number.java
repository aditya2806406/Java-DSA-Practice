class Solution {
    public static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fn1=fib(n-2);
        int fn=fib(n-1)+fn1;
        return fn;

        
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fib(n));
    }
}