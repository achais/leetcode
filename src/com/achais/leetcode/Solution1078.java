package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> list = new ArrayList<>();
        for (int i = 2; i < arr.length; i++) {
            if (arr[i-2].equals(first) && arr[i-1].equals(second)) {
                list.add(arr[i]);
            }
        }
        String[] ans = new String[list.size()];
        return list.toArray(ans);
    }

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";

        Solution1078 solution = new Solution1078();
        String[] stdout = solution.findOcurrences(text, first, second);

        System.out.println(Arrays.toString(stdout));
    }
}
