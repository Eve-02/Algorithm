package 数组结构.t350_两个数组的交集2.r2_排序和双指针_m;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] intersect = new Solution().intersect(nums1, nums2);
        System.out.println(Arrays.toString(intersect));
    }

}
