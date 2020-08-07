package com.achais.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder temp = new StringBuilder();
            for (char aChar : word.toCharArray()) {
                temp.append(table[aChar - 'a']);
            }
            set.add(temp.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};

        Solution804 solution = new Solution804();
        Integer stdout = solution.uniqueMorseRepresentations(words);

        System.out.println(stdout);
    }
}
