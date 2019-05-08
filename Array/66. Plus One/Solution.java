class Solution {
    public int[] plusOne(int[] digits) {
        int N = digits.length;
        
        // 考虑全为9的情况
        for (int i = 0; i < N; i++) {
            if (digits[i] != 9) {
                break;
            }
            if (i == N-1 && digits[i] == 9) {
                int[] ans = new int[N+1];   // 有一个进位，数组不够
                ans[0] = 1;
                for (int j = 1; j < N; j++) {
                    ans[j] = 0;
                }
                return ans;
            }
        }
        
        // 最后一位加1
        digits[N-1] += 1;   
        // 从最后一位反向遍历
        for (int i = N-1; i >= 0; i--) {
            if (digits[i] == 10) {
                digits[i-1] += 1;
                digits[i] = 0;
            } else {
                break;
            }
        }
        
        return digits;
    }
}