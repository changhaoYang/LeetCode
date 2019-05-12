class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Time:O(n), Space:O(1)
        
        // 计算初始值
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double average = (double) sum / k;
        double maxAverage = average;
        
        // 遍历剩下的数组，寻找最大平均数
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i-k];
            average = (double) sum / k;
            maxAverage = Math.max(maxAverage, average);
        }
        
        return maxAverage;
    }
}