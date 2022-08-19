package 数组.t349_两个数组的交集.i1_集合;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/intersection-of-two-arrays/
public class Solution {

    /**
     * 遍历较小的一个数组，装进 Set 中。
     * 第二次遍历另一个数组，每遍历一个数，如果 Set 中包含该数，则将此数存入数组(res)，同时在 Set 中移除。
     *
     * 时间复杂度: O(N+M).其中 N、M 分别为 nums1、nums2 的长度.
     */
    // [执行用时：2ms, 在所有 Java 提交中击败了 95.63% 的用户]
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length) {
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int val : nums2) {
            set.add(val);
        }
        int[] res = new int[nums2.length];
        int count = 0;
        for (int val : nums1) {
            if(set.contains(val)){
                res[count++] = val;
                set.remove(val);
            }
        }
        return Arrays.copyOf(res,count);
    }

}
