package 递归.t231_2的幂.i1_递归取模;

// https://leetcode.cn/problems/power-of-two/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }else if(n == 0 || n%2 != 0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(1));
    }


}
