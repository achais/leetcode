package com.achais.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1507 {
    public String reformatDate(String date) {
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Map<String, Integer> monthMap = new HashMap<>();
        int index = 1;
        for (String s : month) {
            monthMap.put(s, index++);
        }

        String[] arr = date.split(" ");
        arr[0] = arr[0].substring(0, arr[0].length() - 2);

        return String.format("%s-%02d-%02d", arr[2], monthMap.get(arr[1]), Integer.parseInt(arr[0]));
    }

    public static void main(String[] args) {
        String date = "6th Jun 1933";

        Solution1507 solution = new Solution1507();
        String stdout = solution.reformatDate(date);

        System.out.println(stdout);
    }
}
