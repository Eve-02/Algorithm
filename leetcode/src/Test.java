import java.util.ArrayList;
import java.util.List;

public class Test {

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



}
