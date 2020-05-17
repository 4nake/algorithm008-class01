/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    private int row, col;
    public int numIslands(char[][] grid) {
        int count = 0;
        row = grid.length;
        col = grid[0].length;
        if(row == 0) return 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == '1'){
                    DFSMarking(i, j, grid);
                    ++count;
                }
            }
        }
        return count;
    }
    private void DFSMarking(int i, int j, char[][] grid){
        if(i < 0 || j < 0 || i >= row  || j >= col || grid[i][j] != '1') return ;

        grid[i][j] = 0;
        DFSMarking(i + 1, j, grid);
        DFSMarking(i, j + 1, grid);
        DFSMarking(i - 1, j, grid);
        DFSMarking(i, j - 1, grid);
    }
}
// @lc code=end

