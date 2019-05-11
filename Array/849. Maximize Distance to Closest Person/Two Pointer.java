class Solution {
    public int maxDistToClosest(int[] seats) {
        // 双指针：跟踪左边最近的人和右边最近的人
        
        int N = seats.length;
        int prev = -1, future = 0;
        int ans = 0;

        for (int i = 0; i < N; ++i) {
            if (seats[i] == 1) {
                prev = i;
            } else {
                while (future < N && seats[future] == 0 || future < i)
                    future++;
                
                // 没有人在左边：left取N
                int left = prev == -1 ? N : i - prev;
                // 没有人在右边：right取N
                int right = future == N ? N : future - i;
                // 取left与right最小值
                ans = Math.max(ans, Math.min(left, right));
            }
        }

        return ans;
    }
}