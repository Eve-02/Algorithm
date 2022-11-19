package 哈希表.t409_最长回文串.i2_数组_m;

public class Solution {

    /**
     * 数组一般都比哈希表快的，因为哈希表底层维护的就是数组。
     * s 只由 小写、/、大写英文字母组成，所以 ascill 码表中有 128 个，但是常用的 128 个是够用的。
     */
    // 【时间: 2 ms，击败: 66.81%】
    public int longestPalindrome(String s) {
        // "abccccdd" -> "dccaccd"
        int len = s.length();
        int res = 0;
        int[] arr = new int[128];
        for(int i = 0;i < len;i++){
            if(++arr[s.charAt(i)] == 2){
                res+=2;
                arr[s.charAt(i)] = 0;
            }
        }
        if(res < len) res++;
        return res;
    }

}
