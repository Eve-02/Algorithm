package 字符串.t13_罗马数字转整数.i1_模拟;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/roman-to-integer/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：6ms, 在所有 Java 提交中击败了 17.82% 的用户】
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int i=0;
        int len = s.length();
        int result = 0;
        while(i<len){
            char ch = s.charAt(i);
            if(i+1<len){
                char next = s.charAt(i+1);
                int k = map.get(next) / map.get(ch);
                if(k == 5 || k == 10){
                    result += map.get(next) - map.get(ch);
                    i+=2;
                    continue;
                }
            }
            result += map.get(ch);
            i++;
        }
        return result;
    }


}
