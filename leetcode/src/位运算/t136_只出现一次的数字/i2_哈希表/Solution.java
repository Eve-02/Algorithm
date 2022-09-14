package 位运算.t136_只出现一次的数字.i2_哈希表;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【执行用时：12ms, 在所有 Java 提交中击败了 10.71% 的用户】
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer orDefault = map.getOrDefault(num, 0) + 1;
            map.put(num, orDefault);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        new Solution().singleNumber(nums);
    }

}
