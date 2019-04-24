class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int n = A[i].length - 1;
            for (int j = 0; j < A[i].length; j++) {
                B[i][j] = A[i][n];
                n = n - 1;
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (B[i][j] == 0) {
                    B[i][j] = 1;
                } else if (B[i][j] == 1) {
                    B[i][j] = 0;
                }
            }
        }
        return B;
    }
}