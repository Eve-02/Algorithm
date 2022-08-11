package 数组结构.t118_杨辉三角.t88_合并两个有序数组.r1_合并后排序;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        new Solution().merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

}
