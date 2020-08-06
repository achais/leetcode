package com.achais.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        for (String s : map.keySet()) {
            if (map.get(map.get(s)) == null) {
                return map.get(s);
            }
        }
        return "";
    }

    public String destCity2(List<List<String>> paths) {
        List<String> list = new ArrayList<>();
        for (List<String> path : paths) {
            list.add(path.get(0));
        }

        for (List<String> path : paths) {
            if (!list.contains(path.get(1))) {
                return path.get(1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();

        Solution1436 solution = new Solution1436();
        String stdout = solution.destCity(paths);

        System.out.println(stdout);
    }
}
