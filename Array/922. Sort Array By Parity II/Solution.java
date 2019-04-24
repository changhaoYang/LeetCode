class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)   // 遍历所有的偶数位置
            if (A[i] % 2 == 1) {                // 如果偶数位置上有奇数
                while (A[j] % 2 == 1)           // 直到找到一个空的奇数位置
                    j += 2;

                // Swap A[i] and A[j]
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        return A;
    }
}