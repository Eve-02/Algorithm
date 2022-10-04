package 热题HOT_100.t70_爬楼梯.r1_递归;


public class Solution {

    /**
     * 在递归时，进行了很多重复的运算。
     * 比如：计算 到达4 级台阶时需要计算 到达3 和 到达2 级台阶的方法数，
     * 而在计算 到达3 时，又需要计算 到达2 的方法数。
     * 因此我们可以使用记忆化搜索。
     *
     * 时间复杂度: O(2^n).
     */
    // 【超出时间限制】
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }


}
