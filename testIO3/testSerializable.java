package File;

import java.io.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/17
 */
/*
1.一个类的实例化对象能够序列化，必须实现 Serializable接口
2.序列化：对象变成二进制流 ObjectOutputStream
反序列化：二进制流变为对象  ObjectInputStream
3.transient关键字修饰的属性不参与运算
 */
public class testSerializable {

   //序列化到文件
    public  static  void code2(){
        Person person1=new Person("aduo",22,"123456");
        System.out.println(person1);
        //序列化
        //二进制流
        try(FileOutputStream stream=new FileOutputStream("D:"+File.separator+"test1"+File.separator+"person.obj");
            ObjectOutputStream  out=new ObjectOutputStream(stream);){
            out.writeObject(person1);
            out.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //文件反序列化
    public static void code3(){
        try(FileInputStream stream=new FileInputStream("D:"+File.separator+"test1"+File.separator+"person.obj");
            ObjectInputStream in=new  ObjectInputStream(stream);){
            Object returnValue=in.readObject();
            Person person=(Person)returnValue;
            //person对象，按照Java对象方法调用
            System.out.println(person);

        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
       code2();
       code3();
    }
}
class Person implements Serializable {
    private String name;
    private Integer age;
    //transient关键字修饰的属性不参与运算
    private transient  String password;

    public Person(String name, Integer age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}