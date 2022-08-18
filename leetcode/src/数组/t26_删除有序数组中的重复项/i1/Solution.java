package 数组.t26_删除有序数组中的重复项.i1;

// https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
public class Solution {

    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[count-1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(new Solution().removeDuplicates(nums));
    }

}
