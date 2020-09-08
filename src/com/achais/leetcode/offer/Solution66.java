package com.achais.leetcode.offer;

import java.util.Arrays;

public class Solution66 {
    public int[] constructArr(int[] a) {
        int[] NL = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                NL[i] = a[i];
            } else {
                NL[i] = NL[i - 1] * a[i];
            }
        }
        //System.out.println(Arrays.toString(NL));

        int[] NR = new int[a.length];
        for (int i = a.length - 1; i > -1; i--) {
            if (i == a.length - 1) {
                NR[i] = a[i];
            } else {
                NR[i] = NR[i + 1] * a[i];
            }
        }
        //System.out.println(Arrays.toString(NR));

        int[] B = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                B[i] = NR[i + 1];
            } else if (i == a.length - 1) {
                B[i] = NL[i - 1];
            } else {
                B[i] = NL[i - 1] * NR[i + 1];
            }
        }

        return B;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        Solution66 solution = new Solution66();
        int[] stdout = solution.constructArr(a);

        System.out.println(Arrays.toString(stdout));
    }
}
