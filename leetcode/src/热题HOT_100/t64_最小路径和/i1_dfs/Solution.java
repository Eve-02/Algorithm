package 热题HOT_100.t64_最小路径和.i1_dfs;

// https://leetcode.cn/problems/minimum-path-sum/
public class Solution {

    int ans = 0;

    // 【超出时间限制】
    public int minPathSum(int[][] grid) {
        int[] path = new int[2]; // 表示当前的路径，path[0] 表示 x, path[1] 表示 y. 当 x == y == grid.length-1 时，即到达终点
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ans += grid[i][j];
            }
        }
        dfs(grid, path, grid[0][0]);
        return ans;
    }

    private void dfs(int[][] grid, int[] path, int steps) {
        if (path[0] == grid.length - 1 && path[1] == grid[0].length - 1) {
            ans = Math.min(steps, ans);
            return;
        }
        if (path[0] + 1 < grid.length) {
            path[0]++;
            int step = grid[path[0]][path[1]];
            dfs(grid, path, steps + step);
            path[0]--;
        }
        if (path[1] + 1 < grid[0].length) {
            path[1]++;
            int step = grid[path[0]][path[1]];
            dfs(grid, path, steps + step);
            path[1]--;
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(new Solution().minPathSum(grid));
    }


}
