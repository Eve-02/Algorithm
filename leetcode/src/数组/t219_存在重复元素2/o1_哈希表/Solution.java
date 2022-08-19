package 数组.t219_存在重复元素2.o1_哈希表;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * set 始终长度为 k, set 中的元素不重复.
     * 当前超出 k 个时，移除 nums 中第 i-k 个元素，即 nums[i-k].
     */
    // 【执行用时：21ms, 在所有 Java 提交中击败了 24.59% 的用户】
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }

}
