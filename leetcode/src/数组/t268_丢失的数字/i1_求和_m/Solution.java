package 数组.t268_丢失的数字.i1_求和_m;

// https://leetcode.cn/problems/missing-number/
public class Solution {

    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public int missingNumber(int[] nums) {
        int sum = (1+nums.length)*nums.length/2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

}
