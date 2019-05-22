package Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author:QiyeSmart
 * Created:2019/5/13
 */
/*
自定义类排序：
1.元素必须能够排序，实例化元素的类型需要实现Comparable接口  //内部比较器
2.构造TreeSet时指定Comparator的实例化对象  //外部比较器
 */
public class testTreeSet {
    public static void code1(){
        Set<Integer>  set=new TreeSet<>();
        set.add(2);
        set.add(9);
        set.add(5);
        set.add(8);
        set.add(3);
        //按照升序打印
        System.out.println(set);
        Set<String>   set1=new TreeSet<>();
        set1.add("aduo");
        set1.add("duo");
        set1.add("uo");
        set1.add("o");
        //按照首字母升序打印
        System.out.println(set1);
    }
    public static void main(String[] args) {
        //2.构造TreeSet时指定Comparator的实例化对象
        Set<Person3> person=new TreeSet<>(new Comparator<Person3>() {
            @Override
            public int compare(Person3 o1, Person3 o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        //自定义排序方法1测试
        //Set<Person3> person = new TreeSet<>() ;
        person.add(new Person3("aduo",20));
        person.add(new Person3("aduo1",21));
        person.add(new Person3("aduo",22));
        System.out.println(person);

    }
}
//方式1：实例化元素的类型需要实现Comparable接口
class Person3 implements Comparable<Person3>{
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int compareTo(Person3 o) {
        if(this.age>o.getAge()){
            return 1;
        }
        else{
            return -1;
        }
    }

    public Person3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
