package com.achais.leetcode;

public class Solution1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";

        Solution1108 solution = new Solution1108();
        String stdout = solution.defangIPaddr(address);

        System.out.println(stdout);
    }
}
