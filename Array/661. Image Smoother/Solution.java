class Solution {
    public int[][] imageSmoother(int[][] M) {
        
        int rows = M.length;        // 行数
        int cols = M[0].length;     // 列数
        
        int[][] ans = new int[rows][cols];
        
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {   // 遍历每个像素
                int count = 0;
                int sum = 0;
                
                for(int r : new int[] {-1, 0, 1}) {     // 上中下三个位置
                    for(int c : new int[] {-1, 0, 1}) { // 左中右三个位置
                        if(isValid(row+r, col+c, rows, cols)) {
                            sum += M[row+r][col+c];
                            count ++;
                        }
                        
                    }
                }
                
                ans[row][col] = sum / count;
                
            }
        }
        
        return ans;
        
    }
    
    
    // 边界判断方法
    // row < rows 而不是 <= 原因：数组从0计数！！
    private boolean isValid(int row, int col, int rows, int cols) {
        return row < rows && row >= 0 && col < cols && col >= 0;
    }
}