package Collections;

import java.util.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/22
 */
public class testCollections {
    public static void code1(){
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"Java","C++","PHP");
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println(list);
        //填充
        Collections.fill(list,"--");
        System.out.println(list);
    }
    public static void code2(){
        //空集合
        //无法添加元素
        List<String> list=Collections.emptyList();
        System.out.println(list.size());
    }
    public static void code3(){
        //ArrayList线程不安全
        //将线程不安全的变为线程安全
        List<String> list=new ArrayList<>();
        List<String> list1=Collections.synchronizedList(list);
        System.out.println(list1.getClass().getName());
        //HashMap线程不安全
        Map<String,String> map=Collections.synchronizedMap(new HashMap<>());
        System.out.println(map.getClass().getName());

    }
    public static void code4(){
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,6,7,4,9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //乱序
        Collections.shuffle(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
            code4();
    }
}
