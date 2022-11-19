import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    /**
     * List<Integer> list2 = new ArrayList<>(list);
     */
    @org.junit.Test
    public void test1(){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        List<Integer> list2 = new ArrayList<>(list);
        for (Integer integer : list2) {
            System.out.println(integer);
        }
    }

    /**
     * map.containsKey(arr2)
     */
    @org.junit.Test
    public void test2(){
        Map<Character[],Integer> map = new HashMap<>();
        Character[] arr1 = new Character[]{'a','b','c'};
        Character[] arr2 = new Character[]{'a','b','c'};
        map.put(arr1,1);
        System.out.println(map.containsKey(arr2));

        System.out.println("-----------");

        Map<String,Integer> map1 = new HashMap<>();
        String str = "abc";
        String str1 = "abc";
        map1.put(str,1);
        System.out.println(map1.containsKey(str1));
    }





}
