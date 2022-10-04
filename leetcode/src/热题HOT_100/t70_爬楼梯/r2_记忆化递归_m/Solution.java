package 热题HOT_100.t70_爬楼梯.r2_记忆化递归_m;

public class Solution {

    /**
     * 每阶台阶的方法数只计算一次，因此时间复杂度降为 O(N).
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int climbStairs(int n){
        int[] memo = new int[n+1];
        return climbStairsMemo(n,memo);
    }

    public int climbStairsMemo(int n,int[] memo){
        if(memo[n] > 0){
            return memo[n]; // 如果这个数大于0，说明该阶的方法数记录过
        }
        if(n == 1){ // 计录 n 阶的数量 -> 记录 n-1 阶 -> 记录 n-2 阶。。。
            memo[n] = 1;
        }else if(n == 2){
            memo[n] = 2;
        }else{
            memo[n] = climbStairsMemo(n-1,memo) + climbStairsMemo(n-2,memo);
        }
        return memo[n]; // 返回 n 阶
    }

}
