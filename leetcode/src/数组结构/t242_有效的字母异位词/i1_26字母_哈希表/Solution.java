package 数组结构.t242_有效的字母异位词.i1_26字母_哈希表;

// https://leetcode.cn/problems/valid-anagram/
public class Solution {

    /**
     * 时间复杂度: O(N)。
     */

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr1 = new int[26];
        int len = t.length();
        int[] arr2 = new int[26];
        for(int i=0;i<len;i++){
            arr1[t.charAt(i)-'a']++;
            arr2[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

}
