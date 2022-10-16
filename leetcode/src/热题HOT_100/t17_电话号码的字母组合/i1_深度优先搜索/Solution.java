package 热题HOT_100.t17_电话号码的字母组合.i1_深度优先搜索;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
public class Solution {

    // 【执行用时：0ms, 在所有 Java 提交中击败了 100.00% 的用户】
    Map<Integer,String> map = new HashMap<Integer,String>(){{
        put(2,"abc");
        put(3,"def");
        put(4,"ghi");
        put(5,"jkl");
        put(6,"mno");
        put(7,"pqrs");
        put(8,"tuv");
        put(9,"wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        if("".equals(digits) || digits == null){
            return res;
        }
        StringBuilder builder = new StringBuilder();
        int count = 0;
        dfs(digits,builder,count);
        return res;
    }

    List<String> res = new ArrayList<>();
    private void dfs(String digits, StringBuilder builder, int count) {
        if(count == digits.length()){
            res.add(builder.toString());
        }
        int key = digits.charAt(count) - '0';
        String s = map.get(key);
        for(int i=0;i<s.length();i++){
            builder.append(s.charAt(i));
            dfs(digits,builder,count+1);
            builder.delete(builder.length()-1,builder.length());
        }
    }

}
