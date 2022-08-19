package 数组结构.t217_存在相同元素.r2_排序;

import java.util.Arrays;

public class Solution {

    /**
     * &:在对数字从小到大排序之后，数组的重复元素一定出现在相邻位置中。
     * 因此，我们可以扫描已排序的数组，每次判断相邻的两个元素是否相等，如果相等则说明存在重复的元素。
     *
     * 时间复杂度: O(NlogN)，其中 N为数组的长度。需要对数组进行排序。
     * Arrays.sort: O(NlogN)
     */
    // 【执行用时：19ms, 在所有 Java 提交中击败了 35.04% 的用户】
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

}
