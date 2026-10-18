class Solution {
public static long mod=1000000007;
    public static long pow(long x,long n){
        if(n==0){
            return 1;
        }
        long total=1;
        long half=pow(x,n/2);
         total=(half*half)%mod;
            if(n%2==1){
                total=(x*total)%mod;
                

            }
        return total;
    }
    public static int countGoodNumbers(long n) {
        if(n==0){
            return 1;
        }
        long a=pow(5,(n+1)/2);
        long b=pow(4,n/2);
        long ans=(a*b)%mod;

        return (int)ans;
    

    }
    public static void main(String[] args){
        long n=5;
        System.out.println(countGoodNumbers(n));
    }
}