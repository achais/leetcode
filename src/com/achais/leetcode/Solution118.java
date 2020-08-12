package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    line.add(1);
                } else {
                    line.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(line);
        }
        return ans;
    }

    public static void main(String[] args) {
        int numRows = 5;

        Solution118 solution = new Solution118();
        List<List<Integer>> stdout = solution.generate(numRows);

        System.out.println(stdout);
    }
}
