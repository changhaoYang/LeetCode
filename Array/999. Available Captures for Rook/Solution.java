class Solution {
    public int numRookCaptures(char[][] board) {
        int[] rook = new int[2];
        for(int i = 0; i < 8; i++) {    // 找到R的位置
            for(int j = 0; j < 8; j++) {
                if(board[i][j] == 'R') {
                    rook[0] = i;
                    rook[1] = j;
                    break;
                }
            }
        }
        
        int count = 0;
        
        for(int i = rook[0]; i >= 0; i--) {  // 左边开始搜索
            if(board[i][rook[1]] == 'B') {
                break;
            } else if (board[i][rook[1]] == 'p') {
                count++;
                break;
            }
        }
        
        for(int i = rook[0]; i < 8; i++) {  // 右边开始搜索
            if(board[i][rook[1]] == 'B') {
                break;
            } else if (board[i][rook[1]] == 'p') {
                count++;
                break;
            }
        }
        
        for(int i = rook[1]; i < 8; i++) {  // 下面搜索
            if(board[rook[0]][i] == 'B') {
                break;
            } else if (board[rook[0]][i] == 'p') {
                count++;
                break;
            }
        }
        
        for(int i = rook[1]; i >= 0; i--) { // 上面搜索
            if(board[rook[0]][i] == 'B') {
                break;
            } else if (board[rook[0]][i] == 'p') {
                count++;
                break;
            }
        }
        
        return count;
    }
}