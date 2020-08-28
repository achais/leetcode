package com.achais.leetcode;

import java.util.*;

public class Solution884 {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : A.split(" ")) {
            map.merge(s, 1, Integer::sum);
        }
        for (String s : B.split(" ")) {
            map.merge(s, 1, Integer::sum);
        }

        List<String> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) == 1) {
                list.add(s);
            }
        }

        String[] ans = new String[list.size()];
        return list.toArray(ans);
    }

    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";

        Solution884 solution = new Solution884();
        String[] stdout = solution.uncommonFromSentences(A, B);

        System.out.println(Arrays.toString(stdout));
    }
}
