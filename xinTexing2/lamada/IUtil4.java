package lamada;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
@FunctionalInterface // 是一个函数式编程接口，只允许有一个方法
public interface IUtil4<P1,P2,R> {
    R createObject(P1 p1,P2 p2);
}
class Person{
    private String name;
    private Integer age;

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

    public Person(String name,Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}