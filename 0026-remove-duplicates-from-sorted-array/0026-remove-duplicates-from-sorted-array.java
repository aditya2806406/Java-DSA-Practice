class Solution {
    public static int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        
        }
        return k;
        
    }
    public static void main(String args[]){
        Solution sc=new Solution();
        int[] nums={1,1,2};
        int k=sc.removeDuplicates(nums);
        System.out.println("Count after removing all duplicates:"+k);
        System.out.println("After removing duplicates:");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i] +" ");

        }

    }

    
}