package 滑动窗口.t76_最小覆盖子串.i1_滑动窗口;

import java.util.Arrays;

// https://leetcode.cn/problems/minimum-window-substring/
public class Solution {

    // 【超出时间限制】
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int[] arr = new int[2];
        int left = 0,right = 0;
        while(right < s.length() + 1){
            while(right < s.length() + 1 && !isContains(s.substring(left,right),t)){
                right++;
            }
            if((right - left) < (arr[1] - arr[0]) || (arr[1] == 0 && right < s.length()+1 &&  isContains(s.substring(left,right),t))){
                arr[1] = right;
                arr[0] = left;
            }
            left++;
        }
        return s.substring(arr[0],arr[1]);
    }

    // s="aaa", t="aa";
    public boolean isContains(String s,String t){
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chart);
        return new String(chars).contains(new String(chart));
    }

}
