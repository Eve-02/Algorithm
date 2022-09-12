package 哈希表.t389_找不同.i1_数组计数;

// https://leetcode.cn/problems/find-the-difference/
public class Solution {

    /**
     * 只包含小写字母.
     * 时间复杂度: O(N).
     */
    // 【执行用时：2ms, 在所有 Java 提交中击败了 75.01% 的用户】
    public char findTheDifference(String s, String t) {
        int len = s.length();
        int[] arr = new int[26];
        for(int i=0;i<len;i++){
            arr[s.charAt(i)-'a']++; // 记录 s 中的字符个数
        }
        // 对比 t 中的字符个数
        len = t.length();
        for(int i=0;i<len;i++){
            arr[t.charAt(i)-'a']--;
        }
        // 查找添加的字符
        for(int i=0;i<26;i++){
            if(arr[i] == -1){
                return (char)(i+'a');
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        char theDifference = new Solution().findTheDifference(s, t);
        System.out.println(theDifference);
    }

}
