package 位运算.t67_二进制求和.r1_模拟_m;

public class Solution {

    /**
     * 模拟二进制加法，满二进一。
     * 时间复杂度: O(N)，空间复杂度: O(1).
     */
    // 【执行用时：1ms, 在所有 Java 提交中击败了 99.99% 的用户】
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();

        int n = Math.max(a.length(),b.length());
        int carry = 0;
        for(int i=0;i<n;i++){
            // 取得 a 的第 i 位, 并相加。(i = 0 代表取最右边，也就是二进制最低位)
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0; // 当位数不够时，取 0
            // 取得 b 的第 i 位, 并相加
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry%2 + '0'));
            carry /= 2;
        }
        if(carry > 0){
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

}
