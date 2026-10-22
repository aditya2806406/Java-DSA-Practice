
class Solution {
    public static boolean checkEqualPartitions(int[] nums, long target) {
        long total = 1;

        for (int num : nums) {
            total *= num;
        }

        if (target <= 0 || total != target * target) {
            return false;
        }

        return solve(nums, 0, 1, target, 0);
    }

    public static boolean solve(int[] nums, int index,
                                long product, long target, int count) {
        if (product == target && count > 0) {
            return count < nums.length;
        }

        if (index == nums.length || product > target) {
            return false;
        }

        if (solve(nums, index + 1, product, target, count)) {
            return true;
        }

        if (product <= target / nums[index]) {
            if (solve(nums, index + 1,
                    product * nums[index], target, count + 1)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 6, 9};
        long target = 13;

        System.out.println(checkEqualPartitions(nums, target));
    }
}
