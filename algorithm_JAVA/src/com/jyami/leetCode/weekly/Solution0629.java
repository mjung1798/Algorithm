package com.jyami.leetCode.weekly;

import org.junit.jupiter.api.Test;

/**
 * Created by jyami on 2020/06/29
 */
public class Solution0629 {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];
        for (int i = 0; i < m; i++) {
            map[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            map[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                map[i][j] = map[i][j-1] + map[i-1][j];
            }
        }
        return map[m-1][n-1];
    }

    @Test
    void uniquePathsTest(){
        int i = uniquePaths(7,3);
        System.out.println(i);
    }
}
