package 热题HOT_100.t62_不同路径.r1_动态规划;

public class Solution {

    /**
     * 矩阵为 m*n，因为只能走左和右,所以 f[i][j] = f[i-1][j] + f[i][j-1],
     * 为了方便(i、j>0 并且 f[i][0] 与 f[0][j] 都只有一种走法，因为设计其初始值为 1).
     * (f[i][j] 表示走到该点的路径数量)
     *
     * 时间复杂度: O(M*N). 矩阵中每个点都只访问一次.
     *
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for(int i=0;i<m;i++){ // 设置 f[i][0] 的初始值
            f[i][0] = 1;
        }
        for(int j = 0;j<n;j++){ // 设置 f[0][j] 的初始值
            f[0][j] = 1;
        }
        for(int i=1;i<m;i++){ // 从点 f[1][1] 开始确定
            for(int j=1;j<n;j++){
                f[i][j] = f[i-1][j] + f[i][j-1];
            }
        }
        return f[m-1][n-1]; // 返回结果
    }

}
