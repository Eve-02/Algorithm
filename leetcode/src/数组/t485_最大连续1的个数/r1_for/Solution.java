package 数组.t485_最大连续1的个数.r1_for;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 49.69% 的用户】
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }

}
