package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Author:QiyeSmart
 * Created:2019/5/11
 */
/*
在集合中使用了自定义的类，一定要覆写equals和hasecode方法
1.自定义类的equals方法比较的是对象的地址，如果要比较内容，需要覆写equals和hashcode方法
 */
public class Person {
    public static void main(String[] args) {
        List<Person1> person=new ArrayList<>();
        /*
        Person1 person1=new Person1("aduo",21);
        Person1 person2=new Person1("aduoduo",23);
        person.add(person1);
        person.add(person2);*/
        //System.out.println(person);
        //System.out.println(person.contains(person1));
       // Person1 person3=new Person1("aduo",21);
        //调用Object类的equals方法
        //System.out.println(person.contains(new person3));
        //覆写equals方法；
        person.add(new Person1("aduo",32));
        Person1 person1=new Person1("aduo",32);
        System.out.println(person.contains(person1));
    }

}
 class Person1{
  private String name;
  private Integer age;

    public Person1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
      //equals和hashcode同时覆写，参与计算的属性保持一致
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person1 person1 = (Person1) o;

        if (name != null ? !name.equals(person1.name) : person1.name != null) return false;
        return age != null ? age.equals(person1.age) : person1.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return Objects.equals(name, person1.name) &&
                Objects.equals(age, person1.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
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

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
