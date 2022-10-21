package 单调栈.t42_接雨水.i1_单调栈;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// https://leetcode.cn/problems/trapping-rain-water/
public class Solution {

    public int trap(int[] height) {
        // [0,1,0,2,1,0,1,3,2,1,2,1]
        // [1,2,1,4,3,2,1,0,0,1,0,0]
        int length = height.length;
        int[] add = new int[length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<length;i++){
            int h = height[i];
            while(!stack.isEmpty() && h >= height[stack.peek()]){
                int index = stack.pop();
                add[index] = i - index;
            }
            stack.push(i);
        }
        System.out.println(Arrays.toString(add));
        int ans = 0;
        int i = 0;
        while(i < length){
            if(height[i] != 0 && add[i] != 0){
                int k = 0;
                for(int j=i+1;j<i+add[i];j++){
                    k += height[j];
                }
                ans += (add[i] - 1) * height[i] - k;
                i += add[i];
            }else{
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {4,2,3};
        System.out.println(new Solution().trap(height));
    }

}
