class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        
        int left = 0;
        int right = 0;
        
        // right <- sum（除了前两个数）
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        
        for (int i = 0; i < nums.length-1; i++) {
            if (left == right) {
                return i;
            } else {
                left += nums[i];
                right -= nums[i+1];
            }
        }
        
        if (left == 0) {
            return nums.length-1;
        } else {
            return -1;   
        }
    }
}