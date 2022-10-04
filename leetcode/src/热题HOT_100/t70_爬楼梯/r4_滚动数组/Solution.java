package 热题HOT_100.t70_爬楼梯.r4_滚动数组;

public class Solution {

    /**
     * 第 1 阶时，count = 1;
     * 接着维护两个状态：first = 1、second = 2;
     * 第 3 阶时, 更新：first = 2、second = 3;
     * 第 4 阶时，更新: first = 3、second = 5;
     *    ...
     * 第 n 阶，count = second;
     *
     * 时间复杂度: O(N),空间复杂度: O(1).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int climbStairs(int n){
        if(n == 1){
            return 1;
        }
        int first = 1;
        int second = 2;
        for(int i=3;i<=n;i++){
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

}
