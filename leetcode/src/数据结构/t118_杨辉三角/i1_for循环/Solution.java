package 数据结构.t118_杨辉三角.i1_for循环;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/pascals-triangle/
public class Solution {

    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(row);
        }
        return list;
    }


}
