/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[s.length()] = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '0') continue;
            int num = 0;
            for(int j = i; j < s.length() && j - i < 2; j++){
                num = num * 10 + (s.charAt(j) - '0');
                if(num <= 26) dp[i] += dp[j + 1];
            }
        }
        return dp[0];

    }
}
// @lc code=end

