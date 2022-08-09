package 数组结构.t350_两个数组的交集2.r2_排序和双指针;

import java.util.Arrays;

public class Solution {


    /**
     * 首先对两个数组进行排序。
     * 初始两个指针 index1 = index2 = 0，循环比较 index1、index2 对应的值
     * 若 nums1[index1] = nums2[index2]，则将此值存入 result结果集中，且 index1、index2 后移一位;
     * 若 nums1[index1] != nums2[index2]，则较小的下标后移一位，继续比较，直接其中一方遍历到数组尾部;
     *
     *  时间复杂度: O(MLogM+NLogN)。其中 M 为 nums1 的长度，N 为 nums2 的长度。
     *
     */

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0,index2 = 0;
        int k = 0;
        int[] result = new int[Math.max(nums1.length,nums2.length)];
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] == nums2[index2]){
                result[k++] = nums1[index1++];
                index2++;
            }else if(nums1[index1] < nums2[index2]){
                index1++;
            }else{
                index2++;
            }
        }
        return Arrays.copyOfRange(result,0,k);
    }

}
