package 热题HOT_100.t70_爬楼梯.r3_动态规划;

public class Solution {

    /**
     * 时间复杂度: O(N)，空间复杂度: O(N).
     * 在循环过程中只有两个变量被使用到，因此空间复杂度可以优化为 O(1).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int climbStairs(int n){
        if(n == 1){
            return 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<dp.length;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

}
