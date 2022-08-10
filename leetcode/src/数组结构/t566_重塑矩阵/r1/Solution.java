package 数组结构.t566_重塑矩阵.r1;

public class Solution {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if(m*n != r*c){
            return nums;
        }
        int[][] ans = new int[r][c];
        for(int x=0;x<m*n;x++){
            ans[x / c][x % c] = nums[x / n][x % n];
        }
        return ans;
    }
}
