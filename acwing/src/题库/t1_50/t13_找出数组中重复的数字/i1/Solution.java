package 题库.t1_50.t13_找出数组中重复的数字.i1;

// https://www.acwing.com/problem/content/14/
public class Solution {
    public int duplicateInArray(int[] nums) {
        // arr的下标对应 nums中的值，arr的值对应下标(nums值)出现的次数
        int[] arr = new int[nums.length];
        // -1，有重复数字时替换
        int repeat = -1;
        for (int i = 0; i < nums.length; i++) {
            // 若出现数字超出范围，则返回-1
            if (nums[i] >= nums.length || nums[i] < 0) {
                return -1;
            } else {
                // 进行加1，若大于2，则存储该数字
                if (++arr[nums[i]] >= 2) {
                    repeat = nums[i];
                }
            }
        }
        return repeat;
    }
}
