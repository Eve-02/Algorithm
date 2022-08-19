package 数组结构.t387_字符串中第一个唯一字符.r2_使用哈希表存储索引;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Map<Character,Integer>,Character表示该字符,Integer表示该字符首次出现的索引,
     * 第二次出现时修改为 -1,表示该字符重复出现。
     * 遍历完成后，取出不为 -1 的索引，取其中最小值。
     *
     * 时间复杂度：O(n)，其中 n 是字符串 s 的长度。第一次遍历字符串的时间复杂度为 O(n)，
     * 第二次遍历哈希映射的时间复杂度为 O(∣Σ∣)，由于 s 包含的字符种类数一定小于 s 的长度，因此 O(∣Σ∣) 在渐进意义下小于 O(n)，可以忽略。
     *
     */
    // 【执行用时：20ms, 在所有 Java 提交中击败了 64.90% 的用户】
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,-1);
            }else{
                map.put(ch,i);
            }
        }
        int first = len;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if(val != -1 && val < first){
                first = val;
            }
        }
        if(first == len){
            first = -1;
        }
        return first;
    }


}
