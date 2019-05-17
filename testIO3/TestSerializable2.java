package File;

import java.io.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/17
 */
/*
二进制流序列化与反序列化
 */
public class TestSerializable2 {

    public static void main(String[] args) {
        Person1 person1=new Person1("aduduo",24);
        //二进制流
        try(ByteArrayOutputStream stream=new ByteArrayOutputStream();
            ObjectOutputStream out=new ObjectOutputStream(stream);
        ){
            out.writeObject(person1);
            out.flush();
            byte[] data=stream.toByteArray();
            System.out.println(data);
            try(ByteArrayInputStream inStream=new ByteArrayInputStream(data);
            ObjectInputStream in=new ObjectInputStream(inStream);){
                Object returnValue=in.readObject();
                Person1 person2=(Person1)returnValue;
                System.out.println(person2);
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
class Person1 implements Serializable {
    private String name;
    private Integer age;

    public Person1(String name, Integer age) {
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

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}