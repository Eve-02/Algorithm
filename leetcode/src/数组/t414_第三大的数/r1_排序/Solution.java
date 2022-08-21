package 数组.t414_第三大的数.r1_排序;

import java.util.Arrays;

public class Solution {

    /**
     * 时间复杂度：O(NLogN)，其中 n 是数组 nums 的长度。排序需要 O(NlogN) 的时间
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 77.18% 的用户】
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        for(int i=1,diff=1;i<nums.length;i++){
            if(nums[i] != nums[i-1] && ++diff == 3){
                return nums[i];
            }
        }
        return nums[0];
    }

    // 反转数组
    public void reverse(int[] nums){
        int left = 0,right = nums.length-1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}
