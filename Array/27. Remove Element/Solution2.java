class Solution {
    public int removeElement(int[] nums, int val) {
        // 与我思路相似
        // 双指针一个从前开始，一个从后开始
        
        int i = 0;
        int n = nums.length;
        while (i < n) {
            // 重复检查，不会出现最后一位元素也是目标删除元素的情况
            if (nums[i] == val) {   // 将目标删除元素用最后一位元素覆盖
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}