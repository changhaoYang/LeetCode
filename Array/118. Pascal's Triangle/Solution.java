class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows >= 1) {
            List<Integer> row1 = new ArrayList<>();
            row1.add(1);
            ans.add(row1);
        }
        
        if (numRows >= 2) {
            List<Integer> row2 = new ArrayList<>();
            row2.add(1);
            row2.add(1);
            ans.add(row2);
        } 
        
        if (numRows >= 3) {
            for (int i = 3; i <= numRows; i++) {
                List<Integer> rowi = new ArrayList<>();
                // 第一个数总为1
                rowi.add(1);
                // 从第二个数到倒数第二个数之间
                // row[i][j] = row[i-1][j-1] + row[i-1][j]
                for (int j = 2; j < i; j++) {
                    int temp = ans.get(i-2).get(j-2) + ans.get(i-2).get(j-1);
                    rowi.add(temp);
                }
                // 最后一个数总为1
                rowi.add(1);
                ans.add(rowi);
            }
        }
        
        
        return ans;
    }
}