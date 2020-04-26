import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // if (strs == null || strs.length == 0) {
        //     return new ArrayList<>();
        // }
        // List<List<String>> ll = new ArrayList<List<String>>();
        // HashSet iSet = new HashSet<Integer>();

        // for(int i = 0; i < strs.length; i++){
        //     if(iSet.contains(i)) continue;
        //     iSet.add(i);
        //     List<String> ls = new ArrayList<String>();
        //     ls.add(strs[i]);
        //     for(int j = i + 1; j < strs.length; j++){
        //         char[] si = strs[i].toCharArray();
        //         char[] sj = strs[j].toCharArray();
        //         Arrays.sort(si);
        //         Arrays.sort(sj);
        //         if(Arrays.equals(si,sj)){
        //             ls.add(strs[j]);
        //             iSet.add(j);
        //         }
        //     }
        //     ll.add(ls);

        // }
        // return ll;

        if(strs.length == 0) return new ArrayList<>();
        Map<String,List> map = new HashMap<String,List>();
        for (String string : strs) {
            char[] cs = string.toCharArray();
            Arrays.sort(cs);
            String key = String.valueOf(cs);
            if(!map.containsKey(key))map.put(key,new ArrayList());
            map.get(key).add(string);
        }

        return new ArrayList(map.values());
    }
}
// @lc code=end

