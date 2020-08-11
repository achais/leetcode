package com.achais.leetcode;

public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        for (String word : words) {
            if (read(word, chars)) {
                ans += word.length();
            }
        }
        return ans;
    }

    public boolean read(String word, String chars) {
        char[] characters = chars.toCharArray();
        for (char c : word.toCharArray()) {
            boolean exist = false;
            for (int i = 0; i < characters.length; i++) {
                if (characters[i] == c) {
                    characters[i] = '.';
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world"};
        String chars = "hello";

        Solution1160 solution = new Solution1160();
        Integer stdout = solution.countCharacters(words, chars);

        System.out.println(stdout);
    }
}
