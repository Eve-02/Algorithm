package 数据结构.t217_存在相同元素.r3_哈希表_m;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * &:对于数组中每个元素，我们将它插入到哈希表中。
     * 如果插入一个元素时发现该元素已经存在于哈希表中，则说明存在重复的元素。
     *
     * 时间复杂度: O(N)。其中 N为数组的长度
     */
    // [执行用时：5ms, 在所有 Java 提交中击败了 89.35% 的用户]
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

}
