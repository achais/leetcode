package com.achais.leetcode;

public class Solution4 {
    //复杂度不符合要求
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] list = new int[len / 2 + 2]; //重新排列后的数组,求中位数可以减少一半数组长度
        int i=0, j=0;
        for (int k=0; k<len; k++) {
            int v1 = i < nums1.length ? nums1[i] : Integer.MAX_VALUE; //取小值用
            int v2 = j < nums2.length ? nums2[j] : Integer.MAX_VALUE; //取小值用
            //取小值
            if (v1 < v2) {
                list[k] = nums1[i++];
            } else {
                list[k] = nums2[j++];
            }
            if (k > len / 2) break;
        }
        return (len & 1) == 1 ? list[len / 2] : (list[len / 2] + list[len / 2 - 1]) / 2.0;
    }

    public static void main(String[] args) {

        //int[] nums1 = {1,3}, nums2 = {2};
        int[] nums1 = {1,2},nums2 = {3,4,5,6,7,8};

        Solution4 solution = new Solution4();
        double stdout = solution.findMedianSortedArrays(nums1, nums2);

        System.out.println(stdout);
    }
}
