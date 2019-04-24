class Solution {
    public int fib(int N) {
        int[] nums = new int[N+1];
        
        if(N == 0) {
            return 0;
        } else {
            nums[0] = 0;
            nums[1] = 1;
            for(int i = 2; i < N+1; i++) {
            nums[i] = nums[i-2] + nums[i-1];
            }
            return nums[N];
        }

    }
}