package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(1);
            for (int j = i - 1; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int k = 6;

        Solution119 solution = new Solution119();
        List<Integer> stdout = solution.getRow(k);

        System.out.println(stdout);
    }
}
