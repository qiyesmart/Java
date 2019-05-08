package testString;

import java.util.Objects;

/**
 * Author:QiyeSmart
 * Created:2019/5/8
 */
/*
覆写Object累的toString的方法和equals方法
 */
public class Person {
    public static void main(String[] args){
        Person1 per=new Person1("aduo",20);
        Person1 per1=new Person1("aduo",20);
        System.out.println(per.equals(per1));

    }
    //默认Object类提供的toString()方法只能够得到一个对象的地址
    public static void fun(Object obj) {
        System.out.println(obj.toString()); // 默认输出对象调用的就是toString()方法
    }
}
class Person1{
    private String name;
    private int age;

    public Person1(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    //自定义类需要进行内容的输出需要覆写toString方法
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    //覆写Object类的equals方法
    public boolean equals(Object obj) {
        //判断地址是否相等
        if (obj == this) {
            return true ;
        }
        // 不是Person类对象
        if (!(obj instanceof Person1)) {
            return false ;
        }
        //比较两个Person对象内容
        // 向下转型，比较属性值
        Person1 per = (Person1) obj ;
        return this.name.equals(per.name) && this.age==per.age ;
    }
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return age == person1.age &&
                Objects.equals(name, person1.name);
    }*/
    }