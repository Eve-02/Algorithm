package 热题HOT_100.t62_不同路径.r2_数学;

public class Solution {

    /**
     * 从左上角到右下角的过程中，我们需要移动 m+n一2 次，其中有 m-1 次向下移动，n-1次 向右
     * 移动。因此路径的总数，就等于从 m+n-2 次移动中选择 m-1 次向下移动的方案数，即组合
     * 数. C(m+n-2)(m-1)
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; x++, y++) {
            ans = ans * x / y;
        }
        return (int) ans;
    }


}
