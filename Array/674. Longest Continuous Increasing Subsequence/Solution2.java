class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // 方法类似，计算两点之间长度
        
        int ans = 0, anchor = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > 0 && nums[i-1] >= nums[i]) anchor = i;
            ans = Math.max(ans, i - anchor + 1);
        }
        return ans;
    }
}