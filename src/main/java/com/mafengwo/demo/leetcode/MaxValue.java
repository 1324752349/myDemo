package com.mafengwo.demo.leetcode;

/**
 * @author chenminrui
 * @date 2020-06-08 10:56 上午
 */
public class MaxValue {

    public static void main(String[] args) {
        int[][] grid={{1,3,1},
                     {1,5,1},
                     {4,2,1}};
        int i = maxValue(grid);
        System.out.println(i);

        int[] a ={2,3,1,1,4};
        int jump = jump(a);
    }
    public static int maxValue(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        for (int i = 1; i < row; ++i)
            grid[i][0] += grid[i - 1][0];
        for (int j = 1; j < col; ++j)
            grid[0][j] += grid[0][j - 1];
        for (int i = 1; i < row; ++i)
            for (int j = 1; j < col; ++j)
                grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
        return grid[row - 1][col - 1];
    }

    public static int jump (int[] A) {
        int len = A.length;
        int[] dp = new int[len];
        for(int i=1;i<len;i++){
            for(int j=1;j<=i;j++){
                if(j<=A[i-j]){
                    dp[i]=dp[i-j]+1;
                }
            }
            System.out.println();
        }
        return dp[len - 1];
    }


}
