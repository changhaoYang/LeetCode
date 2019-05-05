class Solution {
    public int removeElement(int[] nums, int val) {
        // 两个指针均从0开始
        // 当nums[j]与删除元素相同，跳过它
        // 直到nums[j]不与删除元素相同，将nums[j]赋予nums[i]
        
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}