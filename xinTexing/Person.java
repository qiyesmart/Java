package teXing;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
public class Person {
    private String name;
    private Integer age;
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + this.gender.getFlag() +
                '}';
    }
    public void printInfo(){
        System.out.println("Person类的打印方法"+this.toString());
    }
}
class Student extends Person{
    private String school;

    public Student(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    //override编译时检查子类覆写父类的方法是否规范
    @Override
    public void printInfo(){
        System.out.println("Student类的打印方法"+this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
//实际开发中需要根据业务情况决定此处枚举对象的数量
enum Gender{
    MALE("男"),
    FEMALE("女");
    private String flag;

    Gender(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }
}
