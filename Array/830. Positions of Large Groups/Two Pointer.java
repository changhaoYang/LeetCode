class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        // 双指针法 
        
        List<List<Integer>> ans = new ArrayList();
        int i = 0, N = S.length(); // i is the start of each group
        for (int j = 0; j < N; ++j) {
            // 到最后or与之前不同
            if (j == N-1 || S.charAt(j) != S.charAt(j+1)) {
                // Here, [i, j] represents a group.
                if (j-i+1 >= 3)
                    ans.add(Arrays.asList(new Integer[]{i, j}));
                // 找到一组后，i从下一个元素开始
                i = j + 1;
            }
        }

        return ans;
    }
}