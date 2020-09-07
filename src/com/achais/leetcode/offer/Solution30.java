package com.achais.leetcode.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
解法2
 */
class MinStack30 {
    Deque<Integer> A, B;

    public MinStack30() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    public void push(int x) {
        A.push(x);
        if (B.isEmpty() || B.peek() >= x)
            B.push(x);
    }

    public void pop() {
        if (A.pop().equals(B.peek()))
            B.pop();
    }

    public int top() {
        return A.peek();
    }

    public int min() {
        return B.peek();
    }
}

/*
解法1
 */
//class MinStack30 {
//    Integer size;
//    List<Integer> stack;
//    List<Integer> minIndexStack;
//
//    public MinStack30() {
//        size = 0;
//        stack = new ArrayList<>();
//        minIndexStack = new ArrayList<>();
//    }
//
//    public void push(int x) {
//        stack.add(x);
//        if (size == 0) {
//            minIndexStack.add(0);
//        } else {
//            if (stack.get(minIndexStack.get(size - 1)) < x) {
//                minIndexStack.add(minIndexStack.get(size - 1));
//            } else {
//                minIndexStack.add(size);
//            }
//        }
//        size++;
//    }
//
//    public void pop() {
//        stack.remove(size - 1);
//        minIndexStack.remove(size - 1);
//        size--;
//    }
//
//    public int top() {
//        return stack.get(size - 1);
//    }
//
//    public int min() {
//        return stack.get(minIndexStack.get(size - 1));
//    }
//}

public class Solution30 {
    public static void main(String[] args) {
        MinStack30 obj = new MinStack30();
        obj.push(1);
        int param_3 = obj.top();
        int param_4 = obj.min();
        System.out.println(param_3);
        System.out.println(param_4);
        obj.pop();
    }
}
