package 热题HOT_100.t139_单词拆分.i1;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.cn/problems/word-break/
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        // "cats and og"
        // ["cats","dog","and","an"]
        int length = s.length();
        int L = 0,R = 0;
        while(R < length){
            R++;
            if(R < length && !wordDict.contains(s.substring(L,R))){
                continue;
            }
            while(R+1 < length && wordDict.contains(s.substring(L,R+1))){
                R++;
            }
            L = R;
        }
        return L == length;
    }


    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("and");
        wordDict.add("an");
        System.out.println(new Solution().wordBreak(s, wordDict));
    }

}
