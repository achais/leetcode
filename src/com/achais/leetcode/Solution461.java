package com.achais.leetcode;

public class Solution461 {
    /**
     * 布赖恩·克尼根算法
     */
    public int hammingDistance(int x, int y) {
        int distance = 0;
        int xor = x ^ y;
        while (xor != 0) {
            distance += 1;
            // remove the rightmost bit of '1'
            xor = xor & (xor - 1);
        }
        return distance;
    }

    public int hammingDistance1(int x, int y) {
        int ans = 0;
        int xor = x ^ y;
        while (xor != 0) {
            if (xor % 2 == 1) {
                ans++;
            }
            xor = xor >>> 1;
        }
        return ans;
    }

    public int hammingDistance2(int x, int y) {
        int ans = 0;
        String s = Integer.toBinaryString(x ^ y);
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 1, y = 4;

        Solution461 solution = new Solution461();
        Integer stdout = solution.hammingDistance(x, y);

        System.out.println(stdout);
    }
}
