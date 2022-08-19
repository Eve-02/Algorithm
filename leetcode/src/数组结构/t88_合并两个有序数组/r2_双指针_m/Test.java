package 数组结构.t88_合并两个有序数组.r2_双指针_m;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,7,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        new Solution().merge(nums1,4,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

}
