package 数组.t136_只出现一次的数字.i1_排序;


import java.util.Arrays;

// https://leetcode.cn/problems/single-number/
public class Solution {

    /**
     * 时间复杂度: O(N*LogN).
     */
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i+1<nums.length;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }


}
