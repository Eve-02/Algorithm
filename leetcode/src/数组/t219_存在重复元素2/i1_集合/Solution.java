package 数组.t219_存在重复元素2.i1_集合;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/contains-duplicate-ii/
public class Solution {

    /**
     * 超时....
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k && i < len; i++) {
            if (list.contains(nums[i])) {
                return true;
            } else {
                list.add(nums[i]);
            }
        }
        for (int i = k; i < len; i++) {
            if (list.contains(nums[i])) {
                return true;
            } else {
                list.add(nums[i]);
                list.remove(0);
            }
        }
        return false;
    }

}
