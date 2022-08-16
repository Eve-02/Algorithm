package 字符串.t13_罗马数字转整数.r1_模拟;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * 一般情况下，大的数字在小的左边。
     * 当出现小的数字在左边时，如：IV，则 result - I，若则 result + I.
     */
    public int romanToInt(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int val = symbolValues.get(s.charAt(i));
            if (i + 1 < len && val < symbolValues.get(s.charAt(i + 1))) {
                ans -= val;
            } else {
                ans += val;
            }
        }
        return ans;
    }

}
