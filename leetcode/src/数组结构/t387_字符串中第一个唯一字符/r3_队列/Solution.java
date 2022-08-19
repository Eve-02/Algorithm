package 数组结构.t387_字符串中第一个唯一字符.r3_队列;

import java.util.*;

public class Solution {

    // 【执行用时：39ms, 在所有 Java 提交中击败了 7.10% 的用户】
    public int firstUniqChar(String s){
        Map<Character,Integer> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
                queue.offer(new Pair(ch,i));
            }else{
                map.put(ch,-1);
                while(!queue.isEmpty() && map.get(queue.peek().ch) == -1){
                    queue.poll();
                }
            }
        }
        return queue.isEmpty()?-1:queue.poll().pos;
    }

    class Pair{
        char ch;
        int pos;

        Pair(char ch,int pos){
            this.ch = ch;
            this.pos = pos;
        }
    }
}

