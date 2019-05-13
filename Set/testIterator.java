package Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Author:QiyeSmart
 * Created:2019/5/13
 */
/*
遍历集合：
1.for；
2.foreach
3.iterator
 */
public class testIterator {
    //单向迭代器
    public static void code1(){
        List<String> list = new ArrayList<>() ;
        list.add("Hello") ;
        list.add("Hello") ;
        list.add("B") ;
        list.add("Bit") ;
        list.add("Bit") ;
        Iterator<String> iterator = list.iterator() ; // 实例化Iterator对象
        while (iterator.hasNext()) {
            String str = iterator.next() ;
            if (str.equals("B")) {
                // 使用集合提供的remove()方法，则会产生ConcurrentModificationException
                //list.remove("B") ;
                // 使用Iterator的remove方法则不会产生异常
                iterator.remove();
                continue;
            }
            System.out.println(str) ;
        }

    }
    public static void main(String[] args) {
        //双向迭代器
        List<String> list = new ArrayList<>() ;
        list.add("Hello") ;
        list.add("Hello") ;
        list.add("B") ;
        list.add("Bit") ;
        list.add("Bit") ;
        ListIterator<String> listIterator=list.listIterator();
        System.out.println("从前往后");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+"->");
        }
        System.out.println();
        System.out.println("从后往前");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+"<-");
        }

    }
}
