package 数组.t283_移动0.i1_双指针;

// https://leetcode.cn/problems/move-zeroes/
public class Solution {

    // 【执行用时：2ms, 在所有 Java 提交中击败了 36.24% 的用户】
    public void moveZeroes(int[] nums) {
        int index1 = 0;
        int index2 = 0;
        int len = nums.length;
        while(true){
            // 找到第一个 0
            while(index1 < len && nums[index1] != 0){
                index1++;
            }
            // 找到第一个 非0
            index2 = index2 == 0 ? index1+1 : index2+1; // 第一次赋值时，index1+1.
            while(index2 < len && nums[index2] == 0){
                index2++;
            }
            if(index2 >= len){
                return;
            }else{
                nums[index1] = nums[index2]; // 交换值
                nums[index2] = 0;
                index1++; // index1 后移
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Solution().moveZeroes(nums);
    }

}
