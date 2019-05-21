package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Author:QiyeSmart
 * Created:2019/5/21
 */
//用户也可采用自定义类作为key。
//这个时候一定要记得覆写Object类的hashCode()与equals()方法。
public class testHashMap {
    public static void main(String[] args) {
        Map<Person3,String> map=new HashMap<>();
        map.put(new Person3("aduo",12),"阿朵是猪");
        System.out.println(map.containsKey(new Person3("aduo",12)));
    }
}

 class Person3{
    private String name;
    private Integer age;

    public String toString() {
        return "Person1{" +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person1 = (Person3) o;
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




    public Person3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}