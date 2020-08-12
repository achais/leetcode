package com.achais.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] line = cpdomain.split(" ");
            int num = Integer.parseInt(line[0]);
            String domain = line[1];

            do {
                map.merge(domain, num, Integer::sum);
                int index = domain.indexOf(".");
                if (index >= 0) {
                    domain = domain.substring(index + 1);
                } else {
                    break;
                }
            } while (true);
        }

        List<String> ans = new ArrayList<>();
        for (String s : map.keySet()) {
            ans.add(String.format("%s %s", map.get(s), s));
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        Solution811 solution = new Solution811();
        List<String> stdout = solution.subdomainVisits(cpdomains);

        System.out.println(stdout);
    }
}
