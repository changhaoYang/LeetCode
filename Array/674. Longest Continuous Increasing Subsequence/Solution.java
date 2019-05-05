class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len = 1;
        int max = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) {
                len++;
                if (len > max) {    // 更新最大长度
                    max = len;
                }
            } else {
                len = 1;    // 重新计算长度
            }
        }
        
        // 一些特殊情况
        if (nums.length == 0) {
            return 0;
        } else if (max == 0) {
            return len;
        } else {
            return max;
        }
        
    }
}