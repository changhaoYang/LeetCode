class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        
        for (int i : A) sum += i;
        if (sum % 3 != 0) return false;     // 先看sum能否被3整除

        int count = 0;
        int curSum = 0;
        
        for (int i : A) {
            curSum += i;
            if (curSum == sum / 3) {    // 找到和为sum/3的数值然后count++，分成一部分
                curSum = 0;
                count++;
            }
            if (count == 2) break;
        }
        
        return count == 2;
    }
}