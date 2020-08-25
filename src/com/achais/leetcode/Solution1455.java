package com.achais.leetcode;

public class Solution1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int index = 1;
        for (String s : arr) {
            if (isStartWith(s, searchWord)) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public boolean isStartWith(String s, String search) {
        if (s.length() < search.length()) {
            return false;
        }

        return s.substring(0, search.length()).equals(search);
    }

    public static void main(String[] args) {
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";

        Solution1455 solution = new Solution1455();
        Integer stdout = solution.isPrefixOfWord(sentence, searchWord);

        System.out.println(stdout);
    }
}
