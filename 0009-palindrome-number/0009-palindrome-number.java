class Solution {
    public static boolean isPalindrome(int x) {
        int reverse=0;
        int original=x;
        while(x>0){
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
            
        }
        return original==reverse;
        
        
    }
        public static void main(String args[]){
            int x=121;
            if(isPalindrome(x)){
                System.out.println("Palindrome");
            
            }
            else{
                System.out.println("Not Palindrome");
            }
        

        
    }
}