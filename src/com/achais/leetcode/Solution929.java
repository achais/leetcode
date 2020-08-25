package com.achais.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int at = email.indexOf('@');
            int plus = email.indexOf('+');
            String domain = email.substring(at);
//            System.out.println(domain);
            if (plus == -1) {
                email = email.substring(0, at).replace(".", "");
            } else {
                email = email.substring(0, Math.min(plus, at)).replace(".", "");
            }
//            System.out.println(email);
            set.add(email + domain);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] stdin = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};

        Solution929 solution = new Solution929();
        Integer stdout = solution.numUniqueEmails(stdin);

        System.out.println(stdout);
    }
}
