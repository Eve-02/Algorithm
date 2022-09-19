package 位运算.t318_最大单词长度乘积.i1_双重for循环;

import org.junit.Test;

// https://leetcode.cn/problems/maximum-product-of-word-lengths/
public class Solution {

    // 超出时间限制
    public int maxProduct(String[] words) {
        // 输入：words = ["abcw","baz","foo","bar","xtfn","abcdef"]
        // 输出：16
        // 解释：这两个单词为 "abcw", "xtfn"。
        int ans = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int check = check(words[i], words[j]);
                if(check != -1 && check > ans){
                    ans = check;
                }
            }
        }
        return ans;
    }

    public int check(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            if(s2.contains(s1.charAt(i) + "")){
                return -1;
            }
        }
        return s1.length() * s2.length();
    }

}
