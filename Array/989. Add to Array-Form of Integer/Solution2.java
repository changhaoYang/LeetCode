class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        // 竖式加法原理
        
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {   // 反向遍历
            if (i >= 0)
                cur += A[i];            // 每个数加上剩余数
            ans.add(cur % 10);          // 取个位
            cur /= 10;                  // 取除了个位剩下的
        }

        Collections.reverse(ans);       // 反向
        return ans;
    }
}