package com.achais.leetcode;

import java.util.Arrays;

public class Solution1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] wordArr = new int[words.length];
        int wordIndex = 0;
        for (String word : words) {
            wordArr[wordIndex++] = minCharCount(word);
        }
        Arrays.sort(wordArr);

        int[] ans = new int[queries.length];
        int ansIndex = 0;
        for (String query : queries) {
            int count = minCharCount(query);
            if (count >= wordArr[wordArr.length - 1]) {
                ans[ansIndex++] = 0;
            } else {
                for (int i = 0; i < wordArr.length; i++) {
                    if (count < wordArr[i]) {
                        ans[ansIndex++] = wordArr.length - i;
                        break;
                    }
                }
            }
        }
        return ans;
    }

    public int minCharCount(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int count = 0;
        for (char c : arr) {
            if (c == arr[0]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] queries = {"aabbabbb", "abbbabaa", "aabbbabaa", "aabba", "abb", "a", "ba", "aa", "ba", "baabbbaaaa", "babaa", "bbbbabaa"};
        String[] words = {"b", "aaaba", "aaaabba", "aa", "aabaabab", "aabbaaabbb", "ababb", "bbb", "aabbbabb", "aab", "bbaaababba", "baaaaa"};

        Solution1170 solution = new Solution1170();
        int[] stdout = solution.numSmallerByFrequency(queries, words);

        System.out.println(Arrays.toString(stdout));
    }
}
