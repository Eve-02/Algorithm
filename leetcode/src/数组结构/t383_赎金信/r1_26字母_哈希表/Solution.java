package 数组结构.t383_赎金信.r1_26字母_哈希表;

public class Solution {

    /**
     * 时间复杂度同样是 O(M+N)。但是，在最坏的时间复杂度下，这种方法随着次数的增多，if 语句的判断会比上一种的方法更多，上一种不管字符串多大，只
     * 会比较 26 次，而这种方法在遍历 magazine时，每一个字符都要比较一次。
     *
     */

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int index = ransomNote.charAt(i)-'a';
            arr[index]--;
            if(arr[index] < 0){
                return false;
            }
        }
        return true;
    }

}
