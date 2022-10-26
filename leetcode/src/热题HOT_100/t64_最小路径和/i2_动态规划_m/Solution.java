package 热题HOT_100.t64_最小路径和.i2_动态规划_m;


public class Solution {

    /**
     * 问题： m*n 的矩阵中，求出左上角到右下角的最短距离，且只能走 右和下。
     *
     * 分析：minPath(0,0) 的最短距离 = grid[0,0] + Math.min(minPath(0,1)，minPath(1,0))，类似的：
     *      minPath(0,1) = grid[0,0] + Math.min(minPath(0,2)，minPath(1,1)).
     *      ...
     *
     * 我们用一个相同大小的二维数组来记录矩阵中每个点到右下角的最短距离，并对每个点的最短路径值进行计算。使用递归，
     * 在递归中，最先是确定右下角到右下角的最短路径(grid[length-1,length-1])，这样，我们就可以依次确认其它点到右下角的
     * 最短距离。相关函数： minPath(x,y) = grid[x,y] + Math.min(minPath(x+1,y)[x+1<length]，minPath(x,y+1)[y+1<length]).
     *
     * 时间复杂度: O(mn). 需要对整个风格遍历一次.
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int minPathSum(int[][] grid) {
        int[][] minPath = new int[grid.length][grid[0].length]; // 记录每个点的最短距离
        return CalculateMinPath(grid,minPath,0,0); // 结果
    }

    private int CalculateMinPath(int[][] grid, int[][] minPath,int x,int y) {
        int pathRD = 999; // 右边和下连的最短距离。初始为 999，若右和下都不存在，则 pathRD 的值还是 999。
        if(x + 1 < grid.length){ // 下存在
            if(minPath[x+1][y] == 0){ // 计算该点的最短距离
                minPath[x+1][y] = CalculateMinPath(grid,minPath,x+1,y);
            }
            pathRD = Math.min(minPath[x+1][y],pathRD); // 更新值(取较小)
        }
        if(y + 1 < grid[0].length){ // 右存在
            if(minPath[x][y+1] == 0){ // 计算该点的最短距离
                minPath[x][y+1] = CalculateMinPath(grid,minPath,x,y+1);
            }
            pathRD = Math.min(minPath[x][y+1],pathRD); // 更新值(取较小)
        }
        return minPath[x][y] = grid[x][y] + (pathRD == 999 ? 0 : pathRD); // 记录当前最短路径，并且返回
    }

}
