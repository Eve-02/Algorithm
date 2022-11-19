package 哈希表.t409_最长回文串.i1_哈希表;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/longest-palindrome/
public class Solution {

    /**
     * 时间复杂度: O(N).
     */
    // 【时间: 8 ms，击败: 24.34%】
    public int longestPalindrome(String s) {
        // "abccccdd" -> "dccaccd"
        int len = s.length();
        int res = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < len;i++){
            int count = map.getOrDefault(s.charAt(i),0) + 1;
            if(count == 2){
                count = 0;
                res+=2;
            }
            map.put(s.charAt(i),count);
        }
        if(len % 2 != 0 || res != len){
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(new Solution().longestPalindrome(s));
    }

}
