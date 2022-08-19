package 数组.t219_存在重复元素2.r1_哈希表;

import java.util.HashMap;
import java.util.Map;


public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) {
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            if(map.containsKey(val) && i-map.get(val)<=k){
                return true;
            }else{
                map.put(val,i);
            }
        }
        return false;
    }

}
