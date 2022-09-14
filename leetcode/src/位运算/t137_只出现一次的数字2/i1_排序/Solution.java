package 位运算.t137_只出现一次的数字2.i1_排序;

import java.util.Arrays;

// https://leetcode.cn/problems/single-number-ii/
public class Solution {

    /**
     * 时间复杂度: O(LogN).
     */
    // 【执行用时：3ms, 在所有 Java 提交中击败了 59.13% 的用户】
    public int singleNumber(int[] nums) {
        // 0001112224555666
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 3) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,2,5,5,5,6,6,6,7};
        System.out.println(new Solution().singleNumber(nums));
    }

}
