package 热题HOT_100.t22_括号生成.i1_深度优先搜索;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// https://leetcode.cn/problems/generate-parentheses/
public class Solution {

    /**
     * 将左括号记为 0，将右括号记为 1，用 int[] count 数组表示对应 0、1(左括号、右括号的数量)
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 22.23% 的用户】
    public List<String> generateParenthesis(int n) {
        int[] arr = new int[2]; //
        Arrays.fill(arr,n);
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int count = 0;
        dfs(arr,builder,stack,count,2*n);
        return res;
    }

    List<String> res = new ArrayList<>();
    private void dfs(int[] arr,StringBuilder builder,Stack<Character> stack, int count,int len) {
        if(count == len){
            if(stack.isEmpty()){
                res.add(builder.toString());
            }
            return;
        }
        if(arr[0] != 0){
            stack.push('(');
            builder.append('(');
            arr[0]--;
            dfs(arr,builder,stack,count+1,len);
            stack.pop();
            builder.delete(builder.length()-1,builder.length());
            arr[0]++;
        }
        if(arr[1] != 0){
            if(!stack.isEmpty()){
                stack.pop();
                builder.append(')');
                arr[1]--;
                dfs(arr,builder,stack,count+1,len);
                stack.push(')');
                builder.delete(builder.length()-1,builder.length());
                arr[1]++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }

}
