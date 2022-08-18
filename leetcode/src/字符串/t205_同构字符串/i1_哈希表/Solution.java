package 字符串.t205_同构字符串.i1_哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.cn/problems/isomorphic-strings/
public class Solution {

    /**
     * 1.对 s、t 进行遍历，[bad]、[bab]
     *  使用 map 存放 s->t 的映射关系，使用 list 存放已经被映射过的字符
     *  若 map 不包含 s.charAt(i){不存在该字符的映射关系}，
     *  且 list 不包含 t.charAt(i){该字符未被映射过}，则将此映射关系对加入 map 中，
     *  否则 list 包含 t.charAt(i){说明此字符被其它字符映射过}，return false.
     *  若 map 包含 s.charAt(i)，则比较 map 中此字符的 value 与 t.charAt(i) 是否相等，不相等 return false.
     *
     *  时间复杂度: O(N^2). 最坏的情况下是：每遍历一次(第 i个字符)，都查找 i次(list.contains)，然后添加，直到 i=len.
     *  因此: 1+...+len-1 = (len-1)(len)/2 = 1/2 * (len^2 - len).
     */

    // [执行用时：10 ms, 在所有 Java 提交中击败了 78.44% 的用户]
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        int len = s.length();
        for(int i=0;i<len;i++){
            if(!map.containsKey(s.charAt(i))){
                if(!list.contains(t.charAt(i))){
                    map.put(s.charAt(i),t.charAt(i));
                    list.add(t.charAt(i));
                }else{
                    return false;
                }
            }else if(map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
        return true;
    }


}
