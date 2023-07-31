/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00605;

import java.util.Arrays;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {
        //System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 2));
        //System.out.println(canPlaceFlowers(new int[]{0, 0, 0, 0, 1}, 2));
        //System.out.println(canPlaceFlowers(new int[]{0, 0, 0, 0, 1}, 1));
        //System.out.println(canPlaceFlowers(new int[]{0, 0, 0, 0, 1}, 3));

        //System.out.println(canPlaceFlowers(new int[]{0, 1, 0, 0, 1, 0, 0, 1, 0}, 3));
        System.out.println(canPlaceFlowers(new int[]{0}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int firstPlantedIndex = findFirstPlantedIndex(flowerbed);

        if (firstPlantedIndex == -1) {
            if (n > 0) {
                flowerbed[0] = 1;
                firstPlantedIndex = 0;
                n--;
            } else {
                return true;
            }            
        }

        if ((firstPlantedIndex - 2) < flowerbed.length) {
            int leftIndex = firstPlantedIndex - 2;
            while (leftIndex >= 0) {
                if (flowerbed[leftIndex] != 1) {
                    if (leftIndex - 1 >= 0) {
                        if (flowerbed[leftIndex - 1] == 0) {
                            if (n > 0) {
                                flowerbed[leftIndex] = 1;
                                n--;
                            } else {
                                return true;
                            }
                        } else {
                            leftIndex--;
                        }
                    } else {
                        if (n > 0) {
                            flowerbed[leftIndex] = 1;
                            n--;
                        } else {
                            return true;
                        }
                    }
                }
                leftIndex -= 2;
            }
        }

        if ((firstPlantedIndex + 2) < flowerbed.length) {
            int rightIndex = firstPlantedIndex + 2;
            while (rightIndex < flowerbed.length) {
                if (flowerbed[rightIndex] != 1) {
                    if (rightIndex + 1 < flowerbed.length) {
                        if (flowerbed[rightIndex + 1] == 0) {
                            if (n > 0) {
                                flowerbed[rightIndex] = 1;
                                n--;
                            } else {
                                return true;
                            }
                        } else {
                            rightIndex++;
                        }
                    } else {
                        if (n > 0) {
                            flowerbed[rightIndex] = 1;
                            n--;
                        } else {
                            return true;
                        }
                    }
                }
                rightIndex += 2;
            }
        }

        return n == 0;
    }

    private static int findFirstPlantedIndex(int[] flowerbed) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                return i;
            }
        }
        return -1;
    }

}
