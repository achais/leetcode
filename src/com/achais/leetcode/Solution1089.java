package com.achais.leetcode;

import java.util.Arrays;

public class Solution1089 {
    /*
    解法2
     */
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int j = arr.length - 1;
                while (j > i) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                i++;
            }
        }
    }

    /*
    解法1
     */
    public void duplicateZeros1(int[] arr) {
        int[] array = new int[arr.length];
        int index = 0;
        for (int i : arr) {
            if (i == 0) {
                array[index++] = 0;
                if (index >= array.length) {
                    break;
                }
                array[index++] = 0;
            } else {
                array[index++] = i;
            }
            if (index >= array.length) {
                break;
            }
        }
        System.arraycopy(array, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        Solution1089 solution = new Solution1089();
        solution.duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
