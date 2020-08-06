package com.achais.leetcode;

public class Solution1342 {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        int num = 8;

        Solution1342 solution = new Solution1342();
        int stdout = solution.numberOfSteps(num);

        System.out.println(stdout);
    }
}
