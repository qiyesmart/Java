package List;

import java.util.LinkedList;
import java.util.List;

/**
 * Author:QiyeSmart
 * Created:2019/5/11
 */
public class testLinkedList {
    public static void main(String[] args) {
        //使用链表，不需要容量
        List<String> list=new LinkedList<>();


        list.add("aduo");
        list.add("aduo1");
        list.add("aduo2");
        list.add(0,"aduo1");
        list.add("aduo1");
        System.out.println(list);
        System.out.println("---------------------");
        System.out.println("List是否为空"+list.isEmpty());
        System.out.println("List的长度"+list.size());
        System.out.println("List是否包含aduo"+list.contains("aduo"));
        System.out.println("List移除aduo1"+list.remove("aduo"));
        System.out.println("List移除0"+list.remove(0));
        System.out.println(list);
    }

}
