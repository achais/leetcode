package com.achais.leetcode;

public class Solution824 {
    public String toGoatLatin(String S) {
        String[] arr = S.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            if (!aeiou(arr[i])) {
                sb.delete(0, 1);
                sb.append(arr[i].charAt(0));
            }
            sb.append("ma");
            sb.append(String.format("%1$" + (i + 1) + "s", "a").replace(" ", "a"));
            arr[i] = sb.toString();
        }
        return String.join(" ", arr);
    }

    public boolean aeiou(String s) {
        return "aeiouAEIOU".contains(String.valueOf(s.charAt(0)));
    }

    public static void main(String[] args) {
        String stdin = "I speak Goat Latin";

        Solution824 solution = new Solution824();
        String stdout = solution.toGoatLatin(stdin);

        System.out.println(stdout);
    }
}
