package 数组结构.t242_有效的字母异位词.r1_转数组排序;

import java.util.Arrays;

public class Solution {

    /**
     * 时间复杂度: O(NlogN)。s.length() 与 t.length()相等。
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 79.37% 的用户】
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }


}
