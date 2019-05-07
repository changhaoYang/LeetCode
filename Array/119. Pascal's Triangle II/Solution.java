class Solution {
    public List<Integer> getRow(int rowIndex) {
        int newRowIndex = rowIndex+1;
        
        // 初始第1行
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        
        // 初始第2行
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        
        // 初始前两行
        List<List<Integer>> list = new ArrayList<>();
        list.add(row1);
        list.add(row2);
        
        if (newRowIndex == 1) {
            return row1;
        } else if (newRowIndex == 2) {
            return row2;
        } else {
            for (int i = 2; i < newRowIndex; i++) {
                List<Integer> rowi = new ArrayList<>();
                rowi.add(1);
                // ！每一行的长度由行号数控制
                for (int j = 1; j < i; j++) {
                    // list[i][j] = list[i-1][j-1] + list[i-1][j]
                    rowi.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));   
                }
                rowi.add(1);
                list.add(rowi);
            }
        }
        
        return list.get(rowIndex);
    }
}