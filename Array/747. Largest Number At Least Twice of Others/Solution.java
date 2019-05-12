class Solution {
    public int dominantIndex(int[] nums) {
        // 两次O(n)循环，Time：O(n)，Space：O(1)
        
        // 找到最大的数max
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i == maxIndex) {
                continue;
            }
            if (max < 2*nums[i]) {
                return -1;
            }
        }
        return maxIndex;
    }
}