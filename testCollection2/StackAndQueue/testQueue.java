package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:QiyeSmart
 * Created:2019/5/22
 */
public class testQueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("aduo");
        queue.add("aduo1");
        queue.add("aduo2");
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //如果队列为空，继续出队列，返回null
        System.out.println(queue.poll());

    }
}
