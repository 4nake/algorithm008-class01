import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        recur(1, n, k, res, new ArrayList<Integer>());
        return res;
    }
    public void recur(int i, int n, int k, List<List<Integer>> res, ArrayList<Integer> tmp) { 
        // terminator 
        if (k == 0) { 
          // process result
            res.add(new ArrayList<>(tmp));
            return; 
        }
        // process current logic 
        for (int j = i; j <= n; j++) {
            tmp.add(j);
            // drill down 
            recur(j + 1, n, k - 1, res, tmp);
            // restore current status 
            tmp.remove(tmp.size() - 1);
        } 
      }
}
// @lc code=end

