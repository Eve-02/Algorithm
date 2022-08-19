package 字符串.t344_反转字符串.i1_双指针_m;

// https://leetcode.cn/problems/reverse-string/
public class Solution {

    /**
     * 时间复杂度: O(N). 数组长度为 N,一共进行了 N/2 次交换
     */
    // 【执行用时：0 ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public void reverseString(char[] s) {
        int len = s.length;
        char ch = ' ';
        for(int i=0;i<len/2;i++){
            ch = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = ch;
        }
    }

}
