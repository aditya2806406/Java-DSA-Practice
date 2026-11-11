class Solution {
    public long countValidSubstrings(String s) {
        int n=s.length();
        long total=(long)n*(n+1)/2;
        int a=-1;
        int b=-1;
        long firstinvalid=-1;
        long invalid=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
               a=i;
            }
            else if(s.charAt(i)=='b' && a>-1){
                b=a;
            }
            else if(s.charAt(i)=='c' && b>-1){
              firstinvalid=b;
              
            }
            if(firstinvalid!=-1){
                invalid+=firstinvalid+1;
            }
        }
      
        return total-invalid;
    }
}
       