class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < queries[i].length - 1; j++) {
                A[queries[i][j+1]] = queries[i][j] + A[queries[i][j+1]];
                ans[i] = sumEvenValues(A);
            }
        }
        
        return ans;
        
    }
    
    public static int sumEvenValues(int[] A) {     //计算一个数组所有偶数值之和
        int result = 0;
        for(int ele : A) {
            if(ele % 2 == 0) {
                result += ele;
            }
        }
        return result;
    }
}