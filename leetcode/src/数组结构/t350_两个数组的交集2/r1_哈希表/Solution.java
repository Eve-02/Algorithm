package 数组结构.t350_两个数组的交集2.r1_哈希表;



import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 由于同一个数字在两个数组中都可能出现多次，因此需要用哈希表存储每个数字出现的次数。
     * 对于一个数字，其在交集中出现的次数等于该数字在两个数组中出现次数的最小值。
     * 首先遍历第一个数组，并在哈希表中记录第一个数组中的每个数字以及对应出现的次数，
     * 然后遍历第二个数组，对于第二个数组中的每个数字，如果在哈希表中存在这个数字，则将该数字添加到答案，并减少哈希表中该数字出现的次数。
     * 为了降低空间复杂度，首先遍历较短的数组并在哈希表中记录每个数字以及对应出现的次数，然后遍历较长的数组得到交集。
     *
     * 时间复杂度: O(M+N)。其中 M 为 nums1 的长度，N 为 nums2 的长度
     *
     */

    public int[] intersect(int[] nums1, int[] nums2) {
        // 如果数组 nums1 的长度大于 nums2，则调用自身交换数组
        if(nums1.length > nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> map = new HashMap<>();
        // 遍历长度大的那一个数组，若 map 中不存在，则加入；否则 key 对应 val 值加一
        for (int val : nums1) {
            int count = map.getOrDefault(val,0) + 1;
            map.put(val,count);
        }
        // 遍历长度小的那一个数组，将结果存入 result 数组中.
        int[] result = new int[nums1.length];
        int index = 0;
        for (int val : nums2) {
            int count = map.getOrDefault(val,0);
            // 存在相同的数，将此数存入 result
            if(count > 0){
                result[index++] = val;
                count--;
                // 更新 map 中该键值对
                if(count > 0){
                    map.put(val,count);
                }else{
                    map.remove(val);
                }
            }
        }
        return Arrays.copyOfRange(result,0,index);
    }


}
