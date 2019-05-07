class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 强行计算
        int[] ans = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = j;
                    ans[1] = i;
                }
            }
        }
        
        return ans;
    }
}