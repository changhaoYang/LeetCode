class Solution {
    // Shift non-zero values as far forward as possible
    // Fill remaining space with zeros
    // 数组的长度固定！！！
    // 检测非0的数，挨着放，后面全部填0！！

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;        

        int insertPos = 0;
        for (int num: nums) {      
            if (num != 0) nums[insertPos++] = num;
        }        

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}