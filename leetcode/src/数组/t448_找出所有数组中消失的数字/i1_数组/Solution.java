package 数组.t448_找出所有数组中消失的数字.i1_数组;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：3ms, 在所有 Java 提交中击败了 99.61% 的用户】
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            arr[num-1] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                list.add(i+1);
            }
        }
        return list;
    }

}
