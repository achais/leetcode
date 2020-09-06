package com.achais.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

class CQueue09 {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue09() {
        stack1 = new LinkedList<>(); //进
        stack2 = new LinkedList<>(); //出
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if  (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            return -1;
        } else {
            return stack2.pop();
        }
    }
}

public class Solution09 {

    public static void main(String[] args) {
        int value = 1;
        CQueue09 obj = new CQueue09();
        obj.appendTail(value);
        int param_2 = obj.deleteHead();
        System.out.println(param_2);
    }
}
