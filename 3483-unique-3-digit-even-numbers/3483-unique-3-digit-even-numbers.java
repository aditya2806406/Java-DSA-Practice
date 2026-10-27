class Solution {
    public static int totalNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    int total=0;
                    if(i==j || j==k || i==k){
                        continue;
                    }
                    if(digits[i]==0){
                        continue;
                    }
                    total=total+digits[i]*100+digits[j]*10+digits[k];
                    if(total%2==0){
                        set.add(total);
                    }
                }
            }
        }
        return set.size();
    }
    public static void main(String[] args){
        int[] digits={1,5,6,3,7};
        System.out.println(totalNumbers(digits));
    }
}