package 热题HOT_100.t49_字母异位词.r1_排序;

import java.util.*;

public class Solution {

    /**
     * 时间复杂度: O(n*klogk)。其中 n 是字符串的数量，k 是最字符串最大的长度，
     * 最坏的情况是，每个字符串的长度都为 k，都要 k*longk 的时间来进行排序。
     */
    // 【执行用时：6ms, 在所有 Java 提交中击败了 80.12% 的用户】
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array); // 排序后的 String 作为 map 的 key
            List<String> list = map.getOrDefault(key,new ArrayList<>()); // 每个 key 对应一个 List<String>，若没有，则创建一个新的 List<String>
            list.add(str); // 添加
            map.put(key,list); // 更新，或者添加
        }
        return new ArrayList<List<String>>(map.values()); // 创建时复制
    }

}
