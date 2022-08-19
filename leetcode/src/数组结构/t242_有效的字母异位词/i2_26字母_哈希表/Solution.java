package 数组结构.t242_有效的字母异位词.i2_26字母_哈希表;

public class Solution {

    /**
     * 时间复杂度: O(N)。
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 79.37% 的用户】
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        int len = s.length();
        for(int i=0;i<len;i++){
            arr[t.charAt(i)-'a']++;
        }
        for(int i=0;i<len;i++){
            int index = s.charAt(i)-'a';
            arr[index]--;
            if(arr[index] < 0){
                return false;
            }
        }
        return true;
    }
    

}
