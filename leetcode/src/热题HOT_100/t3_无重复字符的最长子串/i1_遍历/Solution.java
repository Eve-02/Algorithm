package 热题HOT_100.t3_无重复字符的最长子串.i1_遍历;

// https://leetcode.cn/problems/longest-substring-without-repeating-characters/
public class Solution {

    /**
     * 确定每一位数字与后面组成的最长不重复子字符串
     */
    // 【执行用时：234ms, 在所有 Java 提交中击败了 5.01% 的用户】
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int count = 0,i = 0;
        StringBuilder builder = new StringBuilder();
        while(i < len && (len - i) > count){
            builder.delete(0,builder.length());
            int k = 0;
            int j = i;
            while(j < len && !builder.toString().contains(s.charAt(j) + "")){
                builder.append(s.charAt(i));
                j++;
                k++;
            }
            count = Math.max(k, count);
            i++;
        }
        return count;
    }

}
