package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1408 {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"leetcode","et","code"};

        Solution1408 solution = new Solution1408();
        List<String> stdout = solution.stringMatching(words);

        System.out.println(stdout);
    }
}
