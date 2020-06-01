/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int row = grid.length, col = grid[0].length;
        int[] dp = new int[col];
        dp[0] = grid[0][0];
        for(int i = 1; i < col; i++){
            dp[i] = dp[i - 1] + grid[0][i];
        }
        for(int i = 1; i < row; i++){
            dp[0] = grid[i][0] + dp[0];
            for(int j = 1; j < col; j++){
                dp[i] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
            }

        }
        return dp[col -1];
    }
}
// @lc code=end

