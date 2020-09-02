package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution868 {
    public int binaryGap(int N) {
        int[] A = new int[32];
        int t = 0;
        for (int i = 0; i < A.length; i++) {
            if (((N >> i) & 1) != 0) {
                A[t++] = i;
            }
        }

        int ans = 0;
        for (int i = 1; i < t; i++) {
            ans = Math.max(ans, A[i] - A[i-1]);
        }
        return ans;
    }

    public int binaryGap2(int N) {
        List<Integer> list = new ArrayList<>();
        while (N > 0) {
            int value = N - (N & (N - 1));
            int n = 0;
            while (value > 0) {
                value >>= 1;
                n++;
            }
            list.add(n);
            N = N & (N - 1);
        }

        int ans = 0;
        for (int i = 1; i < list.size(); i++) {
            ans = Math.max(ans, list.get(i) - list.get(i - 1));
        }
        return ans;
    }

    public static void main(String[] args) {
        int N = 22;

        Solution868 solution = new Solution868();
        Integer stdout = solution.binaryGap(N);

        System.out.println(stdout);
    }
}
