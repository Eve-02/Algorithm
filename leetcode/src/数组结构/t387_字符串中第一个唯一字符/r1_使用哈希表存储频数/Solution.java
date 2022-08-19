package 数组结构.t387_字符串中第一个唯一字符.r1_使用哈希表存储频数;


import java.util.*;

public class Solution {

    /**
     * 我们可以对字符串进行两次遍历。
     * 在第一次遍历时，我们使用哈希映射统计出字符串中每个字符出现的次数。
     * 在第二次遍历时，我们只要遍历到了一个只出现一次的字符，那么就返回它的索引，否则在遍历结束后返回 -1−1。
     *
     * 时间复杂度: O(N)。其中 N 是字符串的长度。
     *
     */
    // 【执行用时：29ms, 在所有 Java 提交中击败了 20.30% 的用户】
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) +1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }


}
