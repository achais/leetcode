package com.achais.leetcode;

public class Solution67 {
    public String addBinary(String a, String b) {
        // 最低位index
        int i = a.length() - 1;
        int j = b.length() - 1;
        // 进位
        int c = 0;
        StringBuilder str = new StringBuilder(a.length() + b.length());

        while (i >= 0 || j >= 0 || c == 1) {
            c += i >= 0 ? a.charAt(i--) - '0' : 0;
            c += j >= 0 ? b.charAt(j--) - '0' : 0;
            // 与运算,取到最低位
            str.append((c & 1) );
            // 往右移动一位,取到高位
            c >>= 1;
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        Solution67 solution = new Solution67();
        String stdout = solution.addBinary(a, b);
        System.out.println(stdout);
    }
}
