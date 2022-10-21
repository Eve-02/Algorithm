package 热题HOT_100.t49_字母异位词.r2_计数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    // 【执行用时：10ms, 在所有 Java 提交中击败了 26.22% 的用户】
    public List<List<String>>groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            for(int i=0;i<str.length();i++){
                counts[str.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于0的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                if(counts[i] != 0){
                    sb.append((char) ('a'+i));
                    sb.append(counts[i]);
                }
            }
            // 完成每个字符串 key 的获取
            String key = sb.toString();
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            // 添加更新
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
