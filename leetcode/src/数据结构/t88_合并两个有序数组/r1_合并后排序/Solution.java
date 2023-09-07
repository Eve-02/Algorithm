package 数据结构.t88_合并两个有序数组.r1_合并后排序;

import java.util.Arrays;

// https://leetcode.cn/problems/merge-sorted-array/
public class Solution {

    /**
     * 最直观的方法是先将数组 nums2 放进数组 nums1 的尾部，然后直接对整个数组进行排序。
     *
     * Arrays.sort时间复杂度为 O(NlogN)，因此
     * 时间复杂度为 O((M+N)log(M+N))
      */
    // [执行用时：1ms, 在所有 Java 提交中击败了 26.64% 的用户]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i!=n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

}
