package 热题HOT_100.t62_不同路径.i1_dfs;

// https://leetcode.cn/problems/unique-paths/
public class Solution {

    int ans = 0;
    // 【超出时间限制】
    public int uniquePaths(int m, int n) {
        dfs(m,n,0,0);
        return ans;
    }

    private void dfs(int m, int n, int x, int y) {
        if(x == m-1 && y == n-1){
            ans++;
            return;
        }
        if(x+1 < m){
            dfs(m,n,x+1,y);
        }
        if(y+1 < n){
            dfs(m,n,x,y+1);
        }
    }

}
