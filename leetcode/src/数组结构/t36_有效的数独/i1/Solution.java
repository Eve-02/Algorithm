package 数组结构.t36_有效的数独.i1;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/valid-sudoku/
public class Solution {

    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            // 验证行、列
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if((board[i][j] != '.' && !row.add(board[i][j])) || (board[j][i] != '.' && !col.add(board[j][i]))){
                    return false;
                }
            }
            // 验证 3x3
            Set<Character> grid = new HashSet<>();
            int k1 = i%3;
            int k2 = i/3*3;
            for(int i1=k1;i1<k1+3;i1++){
                for(int j1=k2;j1<k2+3;j1++){
                    if(board[i1][j1] != '.' && !grid.add(board[i1][j1])){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
