package 热题HOT_100.t49_字母异位词.i1_排序;

import java.util.*;

// https://leetcode.cn/problems/group-anagrams/
public class Solution {

    // 【执行用时：14ms, 在所有 Java 提交中击败了 14.24% 的用户】
    public List<List<String>> groupAnagrams(String[] strs) {
        int length = strs.length;
        List<List<String>> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<length;i++){
            String s = strs[i];
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            Integer integer = map.getOrDefault(Arrays.toString(chars), -1);
            if(integer != -1){
                ans.get(integer).add(s);
            }else{
                map.put(Arrays.toString(chars),ans.size());
                List<String> list = new ArrayList<>();
                list.add(s);
                ans.add(list);
            }
        }
        return ans;
    }

}
