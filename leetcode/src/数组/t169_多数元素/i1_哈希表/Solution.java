package 数组.t169_多数元素.i1_哈希表;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Map统计次数.
     */
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int val = map.getOrDefault(num, 0) + 1;
            map.put(num,val);
        }
        int n = nums.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }

}
