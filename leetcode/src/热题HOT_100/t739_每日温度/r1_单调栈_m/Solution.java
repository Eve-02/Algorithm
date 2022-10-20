package 热题HOT_100.t739_每日温度.r1_单调栈_m;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    /**
     * 时间复杂度: O(n).
     */
    // 【执行用时：23ms, 在所有 Java 提交中击败了 81.21% 的用户】
    public int[] dailyTemperatures(int[] temperatures){
        int length = temperatures.length;
        int[] ans = new int[length]; // 结果
        Deque<Integer> stack = new ArrayDeque<>(); // 栈,存放的是下标 (双队列的方式)
        for(int i=0;i<length;i++){
            int temperature = temperatures[i]; // 取出当前温度
            // (循环判断)当栈顶不为空，并且当前温度大于栈顶温度，说明 -> 栈顶温度后的第一个比它大的温度就是当前温度
            while(!stack.isEmpty() && temperature > temperatures[stack.peek()]){
                int preIndex = stack.pop(); // 取出栈顶下标
                ans[preIndex] = i - preIndex; // 计算天数
            }
            // 当前温度(下标)入栈
            stack.push(i);
        }
        return ans;
    }

}
