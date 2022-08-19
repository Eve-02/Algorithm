package 数组.t349_两个数组的交集.i2_数组_m;

import java.util.Arrays;

public class Solution {

    /**
     * 时间复杂度: O(N+M).
     */
    // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }
        int[] arr2 = new int[1001]; // nums1、nums2 中的数范围在 0~1000
        for (int i : nums2) {
            arr2[i] = 1;
        }
        int[] res = new int[nums2.length];
        int count = 0;
        for (int i : nums1) {
            if(arr2[i] == 1){
                res[count++] = i;
                arr2[i] = 0;
            }
        }
        return Arrays.copyOf(res,count);
    }

}
