package 数组结构.t387_字符串中第一个唯一字符.i1_IndexOf与lastIndexOf;

import org.junit.Test;

// https://leetcode.cn/problems/first-unique-character-in-a-string/
public class Solution {


    /**
     * 如果 s.indexOf(s.charAt(i)+"") == s.lastIndexOf(s.charAt(i)+"")，
     * 则 s.charAt(i) 在字符串中唯一。
     *
     * 时间复杂度: O(N^2)。String.IndexOf(str) 的时间复杂度为 O(str.length * String.length)。
     *
     */
    // 【执行用时：35ms, 在所有 Java 提交中击败了 10.11% 的用户】
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i) + "") == s.lastIndexOf(s.charAt(i) + "")){
                return i;
            }
        }
        return -1;
    }

}
