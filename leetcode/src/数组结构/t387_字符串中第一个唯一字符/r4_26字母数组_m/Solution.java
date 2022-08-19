package 数组结构.t387_字符串中第一个唯一字符.r4_26字母数组_m;

public class Solution {

    // 【执行用时：4ms, 在所有 Java 提交中击败了 92.47% 的用户】
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int n = s.length();
        for(int i=0;i<n;i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(arr[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1;
    }


}
