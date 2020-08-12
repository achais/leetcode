package com.achais.leetcode;

public class Solution762 {
    public int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(calNumber(i))) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int a) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int prime : primes) {
            if (a == prime) {
                return true;
            }
        }
        return false;
    }

    public int calNumber(int a) {
        //return Integer.bitCount(a);
        int num = 0;
        while (a > 0) {
            a = a & (a - 1);
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        int L = 10;
        int R = 15;

        Solution762 solution = new Solution762();
        Integer stdout = solution.countPrimeSetBits(L, R);

        System.out.println(stdout);
    }
}
