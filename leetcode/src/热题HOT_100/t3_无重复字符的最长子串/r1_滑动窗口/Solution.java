package 热题HOT_100.t3_无重复字符的最长子串.r1_滑动窗口;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int ans = 0;
        int right = -1;
        for(int i = 0;i<n;i++){
            if(i != 0){
                set.remove(s.charAt(i-1));
            }
            while(right+1 < n && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            ans = Math.max(ans,right - i+1);
        }
        return ans;
    }

}
