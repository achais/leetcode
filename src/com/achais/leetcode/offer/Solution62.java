package com.achais.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

public class Solution62 {
    /*
    约瑟夫环
     */
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }

    public int lastRemaining2(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + m - 1) % list.size();
            list.remove(index);
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        int n = 5, m = 3;

        Solution62 solution = new Solution62();
        Integer stdout = solution.lastRemaining(n, m);

        System.out.println(stdout);
    }
}
