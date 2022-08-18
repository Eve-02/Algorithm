package 数组.t66_加一.i1;

// https://leetcode.cn/problems/plus-one/
public class Solution {

    // // [执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户]
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(!(digits[i]==9)){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }

}
