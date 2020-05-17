/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    private int row, col;
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0){
            return false;
        }
        int n = matrix[0].length;
        if(n == 0){
            return false;
        }
        for(int i = 0; i < m; i++){
            if(matrix[i][0] > target){
                return false;
            }
            if(matrix[i][n - 1] < target){
                continue;
            }
            return binarySearch(matrix[i], target);
        }
        return false;
    }

    public boolean binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while(left <= right){
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            mid = (left + right) / 2;        
        }
        return false;
    }
}
// @lc code=end

