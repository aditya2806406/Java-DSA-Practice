class Solution {
    public static boolean isPowerOfTwo(int n) {
        int x=0;
        int ans=0;
        while(ans<n){
            ans=(int)Math.pow(2,x);
           if(ans==n && ans!=Integer.MAX_VALUE){
            return true;
           }
            

            
           
           
           x++;
        }
        return false;

        
    }
    public static void main(String[] args){
        int n=8;
        System.out.println(isPowerOfTwo(n));
    }
}