package t1_50.t16_替换空格.i1_StringBuilder;

// https://www.acwing.com/problem/content/17/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */

    public String replaceSpaces(StringBuffer str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String s = str.charAt(i) == ' ' ? "%20" : str.charAt(i) + "";
            builder.append(s);
        }
        return builder.toString();
    }
}
