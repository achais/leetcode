package com.achais.leetcode;

public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int dao = 0;
        int line = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++) {
                //岛屿数量
                if (grid[x][y] == 1) {
                    dao++;
                    //右边,下边,有相连的岛屿
                    if (x + 1 < grid.length && grid[x + 1][y] == 1) {
                        line++;
                    }
                    if (y + 1 < grid[0].length && grid[x][y + 1] == 1) {
                        line++;
                    }
                }
            }
        }
        return 4 * dao - 2 * line;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        Solution463 solution = new Solution463();
        Integer stdout = solution.islandPerimeter(grid);

        System.out.println(stdout);
    }
}
