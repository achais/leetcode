package com.achais.leetcode;

public class Solution1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for (int i : arr1) {
            ans++;
            for (int ii : arr2) {
                if (Math.abs(i - ii) <= d) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2, 3};
        int[] arr2 = {-4, -3, 6, 10, 20, 30};
        int d = 3;

        Solution1385 solution = new Solution1385();
        Integer stdout = solution.findTheDistanceValue(arr1, arr2, d);

        System.out.println(stdout);
    }
}
