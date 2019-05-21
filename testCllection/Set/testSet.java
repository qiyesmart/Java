package Set;

import List.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:QiyeSmart
 * Created:2019/5/13
 */
public class testSet {
    public static void code1(){
        Set<String> set=new HashSet<>();
        set.add("aduo");
        set.add("aduo1");
        set.add("aduo2");
        set.add("aduo3");
        set.add("aduo1");
        System.out.println("Set的size "+set.size());
        System.out.println("Set是否包含aduo "+set.contains("aduo"));
        System.out.println("Set是否包含aduo1 "+set.contains("aduo1"));
        //无序打印，打印顺序不确定
        System.out.println(set);
        System.out.println(set.remove("aduo"));
        System.out.println(set);
    }
    public static void main(String[] args) {
        //集合框架用户自定义类型相等判断对象是否相等需要覆写equals和hashcode方法
        /*Set<Person2> person=new HashSet<>();
        person.add(new Person2("aduo",20));
        person.add(new Person2("aduo1",21));
        person.add(new Person2("aduo",20));
        System.out.println(person);
       */
    }
}
