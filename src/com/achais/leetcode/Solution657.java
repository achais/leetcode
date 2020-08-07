package com.achais.leetcode;

public class Solution657 {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'L') x--;
            else if (c == 'R') x++;
        }
        return x == 0 && y == 0;
    }

    public boolean judgeCircle2(String moves) {
        int[] point = {0, 0};
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    point[1]++;
                    break;
                case 'D':
                    point[1]--;
                    break;
                case 'L':
                    point[0]--;
                    break;
                case 'R':
                    point[0]++;
                    break;
            }
        }
        return point[0] == 0 && point[1] == 0;
    }

    public static void main(String[] args) {
        String moves = "UD";

        Solution657 solution = new Solution657();
        boolean stdout = solution.judgeCircle(moves);

        System.out.println(stdout);
    }
}
