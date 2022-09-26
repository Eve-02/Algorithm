package 滑动窗口.t76_最小覆盖子串.r1_滑动窗口;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    Map<Character,Integer> ori =  new HashMap<>();
    Map<Character,Integer> cnt = new HashMap<>();

    public String minWindow(String s, String t) {
        int tLen = t.length();
        // ori: 记录 t 中的字符个数
        for(int i=0;i<tLen;i++){
            char c = t.charAt(i);
            ori.put(c,ori.getOrDefault(c,0) + 1);
        }
        int left = 0;
        int right = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();
        while(right < sLen){
            right++;
            if(right < sLen && ori.containsKey(s.charAt(right))){
                cnt.put(s.charAt(right), cnt.getOrDefault(s.charAt(right),0) +1);
            }
            while (check() && left <= right) {
                if(right - left + 1 < len){
                    len = right - left + 1;
                    ansL = left;
                    ansR = left + len;
                }
                if(ori.containsKey(s.charAt(left))){
                    cnt.put(s.charAt(left),cnt.getOrDefault(s.charAt(left),0) -1);
                }
                left++;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL,ansR);
    }

    public boolean check(){
        Iterator<Map.Entry<Character, Integer>> iterator = ori.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> entry = iterator.next();
            Character key = entry.getKey();
            Integer val = entry.getValue();
            if(cnt.getOrDefault(key,0) < val){
                return false;
            }
        }
        return true;
    }

}
