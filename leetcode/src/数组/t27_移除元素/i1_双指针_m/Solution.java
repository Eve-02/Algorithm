package 数组.t27_移除元素.i1_双指针_m;

// https://leetcode.cn/problems/remove-element/
public class Solution {

    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }

}
