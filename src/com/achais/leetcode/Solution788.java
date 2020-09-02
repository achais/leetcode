package com.achais.leetcode;

public class Solution788 {
    public int rotatedDigits(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isGood(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isGood(int n) {
        String s = String.valueOf(n);
        if (s.contains("3") || s.contains("4") || s.contains("7")) {
            return false;
        }

        s = s.replace("2", "e");
        s = s.replace("5", "2");
        s = s.replace("e", "5");

        s = s.replace("6", "l");
        s = s.replace("9", "6");
        s = s.replace("l", "9");

        return n != Integer.parseInt(s);
    }

    public static void main(String[] args) {
        int N = 10000;

        Solution788 solution = new Solution788();
        Integer stdout = solution.rotatedDigits(N);

        System.out.println(stdout);
    }
}
