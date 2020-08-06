package com.achais.leetcode;

public class Solution1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                // 剪枝, 先判断后循环
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 7, 3, 12, 1, 12, 2, 3};
        int a = 5, b = 8, c = 1;

        Solution1534 solution = new Solution1534();
        Integer stdout = solution.countGoodTriplets(arr, a, b, c);

        System.out.println(stdout);
    }
}
