package Set;


import java.io.Serializable;
import java.util.Objects;

/**
 * Author:QiyeSmart
 * Created:2019/5/13
 */
public class Person2{
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
        Person2 person1 = (Person2) o;
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




    public Person2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
