package com.achais.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution500 {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            int line = inLine(word.charAt(0));
            boolean pass = true;
            for (char c : word.toCharArray()) {
                if (inLine(c) != line) {
                    pass = false;
                    break;
                }
            }
            if (pass) {
                list.add(word);
            }
        }

        String[] ans = new String[list.size()];
        int index = 0;
        for (String s : list) {
            ans[index++] = s;
        }
        return ans;
    }

    public int inLine(char c) {
        String[] lines = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        for (int i = 0; i < 3; i++) {
            if (lines[i].contains(String.valueOf(c))) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        Solution500 solution = new Solution500();
        String[] stdout = solution.findWords(words);

        System.out.println(Arrays.toString(stdout));
    }
}
