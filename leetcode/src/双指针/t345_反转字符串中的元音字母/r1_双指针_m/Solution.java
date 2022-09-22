package 双指针.t345_反转字符串中的元音字母.r1_双指针_m;

// https://leetcode.cn/problems/reverse-vowels-of-a-string/
public class Solution {

    // 【执行用时：2ms, 在所有 Java 提交中击败了 95.56% 的用户】
    public String reverseVowels(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        int i=0,j=len-1;
        while(i<j){
            while(i<len && !isVowel(arr[i])){
                i++;
            }
            while(j>0 && !isVowel(arr[j])){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)>=0;
    }

    public void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
