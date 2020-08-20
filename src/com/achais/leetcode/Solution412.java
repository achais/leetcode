package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;

        Solution412 solution = new Solution412();
        List<String> stdout = solution.fizzBuzz(n);

        System.out.println(stdout);
    }
}
