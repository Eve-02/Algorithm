package 单调栈.t496_下一个更大元素1.i1_单调栈;

import java.util.*;

// https://leetcode.cn/problems/next-greater-element-i/
public class Solution {

    /**
     *  时间复杂度: O(m+n).
     */
    // 【执行用时：3ms, 在所有 Java 提交中击败了 90.32% 的用户】
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int length2 = nums2.length;
        Map<Integer,Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<nums2.length;i++){
            int k = nums2[i];
            while(!stack.isEmpty() && k > stack.peek()){
                int n = stack.pop();
                map.put(n,k);
            }
            stack.push(k);
        }
        int length1 = nums1.length;
        int[] ans = new int[length1];
        for(int i=0;i<length1;i++){
            ans[i] = map.getOrDefault(nums1[i],-1);
        }
        return ans;
    }

}
