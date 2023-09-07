package 数据结构.t566_重塑矩阵.i1;


// https://leetcode.cn/problems/reshape-the-matrix/
public class Solution {

    /**
     * 时间复杂度: O(N*M)。其中，N 为数组 mat 的行、列。
     *
     */
    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r <0 || c < 0 || r == mat.length || (r*c) != (mat.length * mat[0].length)){
            return mat;
        }
        int[][] arr = new int[r][c];
        int i1 = 0,j1 = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[i1][j1++] = mat[i][j];
                if(j1 == c){
                    j1 = 0;
                    i1++;
                }
            }
        }
        return arr;
    }

}
