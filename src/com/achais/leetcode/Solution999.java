package com.achais.leetcode;

public class Solution999 {
    public int numRookCaptures(char[][] board) {
        int ans = 0;
        int row = board.length;
        int col = board[0].length;
        int x = 0, y = 0;
        here:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break here;
                }
            }
        }

        //4向遍历, 方向数组
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for (int i = 0; i < 4; i++) {
            for (int step = 0; ; step++) {
                int tx = x + step * dx[i];
                int ty = y + step * dy[i];
                if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B') {
                    break;
                }
                if (board[tx][ty] == 'p') {
                    ans++;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        char[][] stdin = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'p', 'p', '.', 'R', '.', 'p', 'B', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'B', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};
        char[][] stdin = {{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','R','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};

        Solution999 solution = new Solution999();
        Integer stdout = solution.numRookCaptures(stdin);

        System.out.println(stdout);
    }
}
