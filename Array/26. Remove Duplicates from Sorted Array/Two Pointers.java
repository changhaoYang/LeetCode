class Solution {
    public int removeDuplicates(int[] nums) {
        // Two Pointers
        // j指针负责遍历完毕nums[]
        // 找到不同的数i指针负责更新数组
        // 最后i指针更新到哪里，就有多少个不同的数
        
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}