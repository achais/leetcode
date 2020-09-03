package com.achais.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution190 {
    public int reverseBits(int n) {
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            arr[i] = n & 1;
            n >>= 1;
        }
        int ans = 0;
        for (int i : arr) {
            ans <<= 1;
            ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int stdin = 0b11111111111111111111111111111101;

        Solution190 solution = new Solution190();
        Integer stdout = solution.reverseBits(stdin);

        System.out.println(stdout);
    }
}
