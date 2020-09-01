package com.achais.leetcode;

public class Solution1287 {
    public int findSpecialInteger(int[] arr) {
        int step = arr.length / 4;
        for (int i = 0; i + step < arr.length; i++) {
            if (arr[i] == arr[i + step]) {
                return arr[i];
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};

        Solution1287 solution = new Solution1287();
        Integer stdout = solution.findSpecialInteger(arr);

        System.out.println(stdout);
    }
}
