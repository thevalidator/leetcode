/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00027;

/**
 * @author thevalidator
 */
public class Solution {

    public static int removeElement2(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static int removeElement(int[] nums, int val) {

        int size = 0;
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0] == val ? 0 : 1;
        }

        int i = 0;
        int j = 1;

        for (; i < nums.length; i++, j++) {
            if (nums[i] == val) {
                while (j < nums.length) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        size++;
                        break;
                    } else {
                        j++;
                    }
                }
            } else {
                size++;
            }
        }

        return size;
    }

    public static void main(String[] args) {

        int[] empty = new int[0];
        int[] one = new int[]{2};
        int[] nums = new int[]{2, 1, 3, 4, 5};

        System.out.println("0= " + removeElement(empty, 0));
        System.out.println("0= " + removeElement(one, 2));
        System.out.println("1= " + removeElement(one, 1));
        System.out.println("4= " + removeElement(nums, 2));

        System.out.println("2= " + removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println("5= " + removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));

        System.out.println("0= " + removeElement(new int[]{3, 3, 3, 3}, 3));

        System.out.println("2= " + removeElement(new int[]{3, 3}, 5));
        System.out.println("3= " + removeElement(new int[]{3, 3, 3}, 5));

    }
}
