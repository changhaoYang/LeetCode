class Solution {
    public int maxDistToClosest(int[] seats) {
        // 三次O(n)循环
        // 一次检测左边距离、一次检测右边、最后取两边最小值
        
        int N = seats.length;
        int[] left = new int[N], right = new int[N];
        // Arrays.fill方法，填充整个数组某个元素
        Arrays.fill(left, N);
        Arrays.fill(right, N);

        for (int i = 0; i < N; ++i) {
            if (seats[i] == 1) left[i] = 0;
            else if (i > 0) left[i] = left[i-1] + 1;
        }

        for (int i = N-1; i >= 0; --i) {
            if (seats[i] == 1) right[i] = 0;
            else if (i < N-1) right[i] = right[i+1] + 1;
        }

        int ans = 0;
        for (int i = 0; i < N; ++i)
            if (seats[i] == 0)
                ans = Math.max(ans, Math.min(left[i], right[i]));
        return ans;
    }
}
