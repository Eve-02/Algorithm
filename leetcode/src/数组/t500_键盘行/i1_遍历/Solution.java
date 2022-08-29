package 数组.t500_键盘行.i1_遍历;

import java.util.Arrays;

// https://leetcode.cn/problems/keyboard-row/
public class Solution {

    // 【执行用时：1ms, 在所有 Java 提交中击败了 32.57% 的用户】
    public String[] findWords(String[] words) {
        String str1 = "qwertyuiopQWERTYUIOP";
        String str2 = "asdfghjklASDFGHJKL";
        String str3 = "zxcvbnmZXCVBNM";
        String[] res = new String[words.length];
        int count = 0;
        for (String word : words) {
            if(str1.contains(word.charAt(0)+"") && check(str1,word)){
                res[count++] = word;
            }else if(str2.contains(word.charAt(0)+"") && check(str2,word)){
                res[count++] = word;
            }else if(str3.contains(word.charAt(0)+"") && check(str3,word)){
                res[count++] = word;
            }
        }
        return Arrays.copyOf(res,count);
    }

    public boolean check(String str,String word){
        for(int i=0;i<word.length();i++){
            if(!str.contains(word.charAt(i) + "")){
                return false;
            }
        }
        return true;
    }

}
