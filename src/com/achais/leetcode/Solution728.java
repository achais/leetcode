package com.achais.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (canSelfDividing(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean canSelfDividing(int x) {
        int temp = x;
        while (temp > 0) {
            int mod = temp % 10;
            if (mod == 0 || x % mod != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;

        Solution728 solution = new Solution728();
        List<Integer> stdout = solution.selfDividingNumbers(left, right);

        System.out.println(stdout);
    }
}
