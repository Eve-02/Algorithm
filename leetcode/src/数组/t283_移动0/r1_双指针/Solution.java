package 数组.t283_移动0.r1_双指针;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 36.24% 的用户】
    public void moveZeroes(int[] nums) {
        int n = nums.length,left = 0,right = 0;
        while(right<n){
            if(nums[right] != 0){
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
            }else{
                right++;
            }
        }
    }

}
