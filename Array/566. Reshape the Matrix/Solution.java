class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] ans = new int[r][c];
        
        int row = nums.length;
        int col = nums[0].length;
        
        int N = row * col;
        
        if(N == r * c) {    //检测是否可以转换
            int[] oneArray = new int[N];    //将矩阵拉长为向量
            int p = 0;

            for(int i = 0; i < nums.length; i++) {
                for(int j = 0; j < nums[i].length; j++) {
                    oneArray[p] = nums[i][j];
                    p++;
                }
            }

            //拉长为向量之后
            int q = 0;

            for(int i = 0; i < ans.length; i++) {
                for(int j = 0; j < ans[i].length; j++) {
                    ans[i][j] = oneArray[q];
                    q++;
                }
            }

            return ans;
            
        } else {    // 如果不能，返回原矩阵
            return nums;
        }
        
        
    }
}