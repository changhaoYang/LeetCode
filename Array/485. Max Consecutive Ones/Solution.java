class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (i < nums.length && nums[i] == 1) {   //确定连续是1，计数器++
                count++;
                i++;
            }
            res = Math.max(res, count);
        }
        return result;
    }
}