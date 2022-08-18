package 字符串.t344_反转字符串.r1_双指针;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    public void reverseString(char[] s) {
        int len = s.length;
        for (int left = 0, right = len - 1; left < right; left++, right--) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
        }
    }

}
