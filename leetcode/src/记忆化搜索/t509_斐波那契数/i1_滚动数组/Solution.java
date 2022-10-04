package 记忆化搜索.t509_斐波那契数.i1_滚动数组;

// https://leetcode.cn/problems/fibonacci-number/
public class Solution {

    /**
     * 时间复杂度: O(N),空间复杂度: O(1).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        // 从第下标 2 的数开始, 0、1、third, third 表示当前的数，也就是下标2，第三个数.
        // 前面 0、1 都等于自己.
        int first = 0,second = 0,third = 1;
        for(int i=2;i<=n;i++){
            first = second;
            second = third;
            third = first + second;
        }
        return third;
    }

}
