package 数组结构.t232_用栈实现队列.i1_m;


import 数组结构.t232_用栈实现队列.i1_m.MyQueue;

public class Test {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

    }

}
