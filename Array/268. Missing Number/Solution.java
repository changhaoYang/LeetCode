class Solution {
    public int missingNumber(int[] nums) {
        // 高斯牛逼
        // 首项为0，末项为length+1（总会有一个数未出现）
        
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}