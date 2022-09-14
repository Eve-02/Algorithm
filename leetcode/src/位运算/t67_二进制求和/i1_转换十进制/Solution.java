package 位运算.t67_二进制求和.i1_转换十进制;


// https://leetcode.cn/problems/add-binary/
public class Solution {

    // 【194 / 294 个通过测试用例】
    public String addBinary(String a, String b) {
        // 输入: a = "11", b = "1"
        // 输出: "100"
        int a1 = Integer.parseInt(a,2);
        int b1 = Integer.parseInt(b,2);
        int res = a1+b1;
        return Integer.toBinaryString(res);
    }

    public static void main(String[] args) {
        String s = new Solution().addBinary("11", "1");
        System.out.println(s);
    }

}
