package 数组结构.t217_存在相同元素.r1_双重for;

// https://leetcode.cn/problems/contains-duplicate/
public class Solution {

    /**
     * 时间复杂度: O(N^2)，其中 N为数组的长度。
     */
    public boolean containsDuplicate(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }


}
