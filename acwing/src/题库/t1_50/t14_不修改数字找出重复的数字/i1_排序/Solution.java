package 题库.t1_50.t14_不修改数字找出重复的数字.i1_排序;

import java.util.Arrays;

// https://www.acwing.com/problem/content/15/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    public int duplicateInArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
