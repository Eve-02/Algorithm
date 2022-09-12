package 哈希表.t389_找不同.r1_ASCII码求和;

public class Solution {

    /**
     * 时间复杂度: O(N).
     * 空间复杂度: O(1).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 75.01% 的用户】
    public char findTheDifference(String s, String t) {
        int as = 0,at = 0;
        for(int i=0;i<s.length();i++){
            as += s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            at += t.charAt(i);
        }
        return (char) (at-as);
    }

}
