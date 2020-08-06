package com.achais.leetcode;

public class Solution1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int ans = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] startTime = {1, 2, 3};
        int[] endTime = {3, 2, 7};
        int queryTime = 4;

        Solution1450 solution = new Solution1450();
        Integer stdout = solution.busyStudent(startTime, endTime, queryTime);

        System.out.println(stdout);
    }
}
