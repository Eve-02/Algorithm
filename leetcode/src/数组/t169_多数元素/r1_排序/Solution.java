package 数组.t169_多数元素.r1_排序;

import java.util.Arrays;

public class Solution {

    /**
     * 时间复杂度: O(NLogN).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 58.82% 的用户】
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
