/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00733;

import java.util.Arrays;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(sr, sc, image, color);
        return image;
    }

    private static void fill(int x, int y, int[][] image, int color) {

        int oldcolor = image[x][y];
        if (oldcolor == color) {
            return;
        }
        image[x][y] = color;

        if (x - 1 >= 0 && image[x - 1][y] == oldcolor) {
            fill(x - 1, y, image, color);
        }
        if (x + 1 < image.length && image[x + 1][y] == oldcolor) {
            fill(x + 1, y, image, color);
        }
        if (y - 1 >= 0 && image[x][y - 1] == oldcolor) {
            fill(x, y - 1, image, color);
        }
        if (y + 1 < image[0].length && image[x][y + 1] == oldcolor) {
            fill(x, y + 1, image, color);
        }

    }

}
