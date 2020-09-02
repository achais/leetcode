package com.achais.leetcode;

public class Solution693 {
    public boolean hasAlternatingBits(int n) {
        int num = (n ^ (n >> 1)) + 1;
        return (num & (num - 1)) == 0;
    }

    public boolean hasAlternatingBits2(int n) {
        int[] A = new int[32];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if ((n >> i) == 0) {
                break;
            }
            if (((n >> i) & 1) == 1) {
                A[index] = 1;
            }
            index++;
        }

        for (int i = 1; i < index; i++) {
            if (A[i] == A[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 5;

        Solution693 solution = new Solution693();
        boolean stdout = solution.hasAlternatingBits(n);

        System.out.println(stdout);
    }
}
