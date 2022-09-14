package 哈希表.t389_找不同.i2_位运算;

public class Solution {

    /**
     * 时间复杂度: O(N).
     * 空间复杂度: O(1).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 75.09% 的用户】
    public char findTheDifference(String s, String t) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            res ^= s.charAt(i)^t.charAt(i);
        }
        return (char) (res^t.charAt(t.length()-1));
    }

}
