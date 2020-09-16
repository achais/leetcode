package com.achais.leetcode;

public class Solution1154 {
    public int dayOfYear(String date) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] strings = date.split("-");
        int year = Integer.parseInt(strings[0]);
        int month = Integer.parseInt(strings[1]);
        int day = Integer.parseInt(strings[2]);
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (leapYear) {
            monthDays[1] = 29;
        }

        int t = 0, days = 0;
        while (t < month - 1) {
            days += monthDays[t++];
        }
        return days + day;
    }

    public static void main(String[] args) {
        String stdin = "2004-03-01";

        Solution1154 solution = new Solution1154();
        Integer stdout = solution.dayOfYear(stdin);

        System.out.println(stdout);
    }
}
