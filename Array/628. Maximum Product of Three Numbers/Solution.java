public class Solution {
    public int maximumProduct(int[] nums) {
        // 排序后两负一正未考虑到！
        
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}