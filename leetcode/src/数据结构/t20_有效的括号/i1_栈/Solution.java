package 数据结构.t20_有效的括号.i1_栈;

import java.util.Stack;

// https://leetcode.cn/problems/valid-parentheses/
public class Solution {

    /**
     * 时间复杂度: O(N)。
     */
    // [执行用时：1ms, 在所有ava提交中击败了 98.90% 的用户]
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isLeftParentheses(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty() || !(getVal(ch) == getVal(stack.pop()))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // ()[]{}
    public boolean isLeftParentheses(char ch){
        return ch == '(' || ch == '[' ||  ch == '{';
    }

    public int getVal(char ch){
        int result = -1;
        if(ch == '(' || ch == ')'){
            result = 0;
        }else if(ch == '[' || ch == ']'){
            result = 1;
        }else{
            result = 2;
        }
        return result;
    }

}
