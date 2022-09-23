package 热题HOT_100.t3_无重复字符的最长子串.i2_滑动窗口Set_m;


import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * 我们维护 left、right 两个指针中的字符串，使其为不重复的子字符串. left 为左窗口，right 为右窗口，
     *    在每一步的操作中，我们以 left 作为枚举不重复字符串的起始位置，然后移动 right，
     *    若 right 指针指向的字符未重复，则添加到 set 当中.
     *    若 right 指针指向的字符重复，与之更新当前的 ans 结果，记录较大的长度，并且 left 右移，作为下一次枚举不重复字符的起始位置.
     * 就这样，我们遍历了字符串中依次的每一个的 不重复的子字符串，并且得到的最大长度的不重复子字符串.
     *
     * 时间复杂度: O(N).
     */
    // 【执行用时：5ms, 在所有 Java 提交中击败了 60.32% 的用户】
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0; // 长度为 0 时返回 0
        Set<Character> set = new HashSet<>(); // 判断是字符串否重复
        int ans = 0; // 结果
        int left = 0; // 左窗口指针
        int right = 0; // 右窗口指针
        while(right < s.length()){
            // 未重复，继续右移添加.
            while(right < s.length() && set.add(s.charAt(right))){
                right++; // 右移
            }
            // 出现重复，更新 ans，同时移除 left 指针指向的元素，left 右移，作为下一次枚举不重复字符的起始位置.
            ans = Math.max(ans,set.size());
            set.remove(s.charAt(left));
            left++;
        }
        return ans; // return
    }

}
