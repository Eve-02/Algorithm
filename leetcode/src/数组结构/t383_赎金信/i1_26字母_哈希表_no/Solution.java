package 数组结构.t383_赎金信.i1_26字母_哈希表_no;

// https://leetcode.cn/problems/ransom-note/
public class Solution {

    /**
     * 分别计数 ransomNote、magazine 中的字符个数，存入对应的数组中 arr1、arr2 (new int[26]);
     * 计数完成后，一遍 for 循环(0-26)，若 arr1[i] 中不为 0，且 arr1[i] > arr2[i]，则返回 false.
     * 遍历结束则返回 true.
     *
     * 时间复杂度: O(M+N)。其中 M、N 分别为数组 ransomNote、magazine 的长度。
     *
     */

    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() > ransomNote.length()){
            return false;
        }
        int[] arr1 = new int[26];
        int len1 = ransomNote.length();
        for(int i=0;i<len1;i++){
            arr1[ransomNote.charAt(i)-'a']++;
        }
        int[] arr2 = new int[26];
        int len2 = magazine.length();
        for(int i=0;i<len2;i++){
            arr2[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr1[i] != 0 && arr1[i] > arr2[i]){
                return false;
            }
        }
        return true;
    }

}
