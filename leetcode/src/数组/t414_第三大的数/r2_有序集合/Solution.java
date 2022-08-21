package 数组.t414_第三大的数.r2_有序集合;

import java.util.TreeSet;

public class Solution {

    /**
     * 时间复杂度：O(N)，其中 N 是数组 nums 的长度。由于有序集合的大小至多为 3，
     * 插入和删除的时间复杂度可以视作是 O(1) 的，因此时间复杂度为 O(N)。
     */
    // 【执行用时：3ms, 在所有 Java 提交中击败了 49.19% 的用户】
    public int thirdMax(int[] nums) {
        TreeSet<Integer> s = new TreeSet<>();
        for (int num : nums) {
            s.add(num);
            if(s.size() > 3){
                s.remove(s.first());
            }
        }
        return s.size() == 3 ? s.first() : s.last();
    }

}
