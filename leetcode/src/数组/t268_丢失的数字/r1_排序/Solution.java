package 数组.t268_丢失的数字.r1_排序;

import java.util.Arrays;

public class Solution {

    /**
     * 时间复杂度: O(NLogN).
     */
    // 【执行用时：8ms, 在所有 Java 提交中击败了 5.67% 的用户】
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

}
