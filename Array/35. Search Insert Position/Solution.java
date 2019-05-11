class Solution {
    public int searchInsert(int[] nums, int target) {
        // O(n)

        int i = 0;
        while (i < nums.length) {
            if (target > nums[i]) {
                i++;
            } else {
                return i;
            } 
        }
        return nums.length;
    }
}