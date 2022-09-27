package 热题HOT_100.t4_寻找两个正序数组的中位数.i1_合并数组;

import java.util.Arrays;

// https://leetcode.cn/problems/median-of-two-sorted-arrays/submissions/
public class Solution {

    // 【执行用时：3ms, 在所有 Java 提交中击败了 20.88% 的用户】
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // 1 2 3 4 -> len=4
        // 1 2 3 4 5 -> len=5
        int[] arr = Arrays.copyOf(nums1,nums1.length+nums2.length);
        for(int i=nums1.length,j=0;i<arr.length;i++,j++){
            arr[i] = nums2[j];
        }
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            return (arr[arr.length/2-1] + arr[arr.length/2])/2.0;
        }else{
            return arr[arr.length/2];
        }
    }




}
