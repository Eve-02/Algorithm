package 字符串.t14_最长公共前缀.i1;

// https://leetcode.cn/problems/longest-common-prefix/
public class Solution {

//    输入：strs = ["flower","flow","flight"]
//    输出："fl"

    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        int len = strs.length;
        if(len<=1){
            return strs[0];
        }
        int count = 0;
        while (true){
            for(int i=0;i<len-1;i++){
                if(count == strs[i].length() || count == strs[i+1].length() || !(strs[i].charAt(count) == strs[i+1].charAt(count))){
                    return builder.toString();
                }
            }
            builder.append(strs[0].charAt(count++));
        }
    }

}
