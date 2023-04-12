/*
 * Copyright (C) 2023 thevalidator
 */
package ru.thevalidator.leetcode.problems.p00200;

/**
 * @author thevalidator <the.validator@yandex.ru>
 */
public class Solution {

    public int numIslands(char[][] grid) {
        
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0') {
                    grid[i][j] = 'w';
                } else if (grid[i][j] == '1') {
                    explore(i, j, grid);
                    counter++;
                }
            }
        }
        
        return counter;
    }

    private void explore(int x, int y, char[][] grid) {
        grid[x][y] = 'l';
        
        int x1 = x - 1;
        if (x1 >= 0 && grid[x1][y] == '1') {
            explore(x1, y, grid);
        }
        
        x1 = x + 1;
        if (x1 < grid.length && grid[x1][y] == '1') {
            explore(x1, y, grid);
        }
        
        int y1 = y - 1;
        if (y1 >= 0 && grid[x][y1] == '1') {
            explore(x, y1, grid);
        }
        
        y1 = y + 1;
        if (y1 < grid[0].length && grid[x][y1] == '1') {
            explore(x, y1, grid);
        }
    }
    
    
}
