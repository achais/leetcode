package com.achais.leetcode;

public class Solution1491 {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0], sum = 0;
        for (int i : salary) {
            min = Math.min(min, i);
            max = Math.max(max, i);
            sum += i;
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }

    public static void main(String[] args) {
        int[] salary = {4000, 3000, 1000, 2000};

        Solution1491 solution = new Solution1491();
        double stdout = solution.average(salary);

        System.out.println(stdout);
    }
}
