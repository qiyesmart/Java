package refelect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
public class testBaseInfo {
    public static void main(String[] args){
        Class sonClass=Son.class;
        //获取包
        Package packages=sonClass.getPackage();
        //包的名称
        System.out.println(packages.getName());
        //获取父类
        Class superClass= sonClass.getSuperclass();
        System.out.println(superClass.getName());//类全限定名（包含包名）
        System.out.println(superClass.getSimpleName());//类名
        System.out.println("---------------------------------------");
        //获取接口
        Class[]   interfaces=sonClass.getInterfaces();
        for(Class i:interfaces){
            System.out.println(i.getName());
        }
        //获取自己的类名
        System.out.println("---------------------------------------");
        System.out.println(sonClass.getName());//类全限定名（包含包名）
        System.out.println(sonClass.getSimpleName());//类名\
        System.out.println("---------------------------------------");
        //获取所有构造方法
        Class personClass=Person.class;
        Constructor[]   constructors=personClass.getConstructors();
        for(Constructor c:constructors){
            //c.getParameterAnnotations()获取参数类型
            System.out.println(c.getName()+"("+ Arrays.toString(c.getParameterAnnotations())
            +")");
        }
        System.out.println("---------------------------------------");
        //有参数的构造方法
        try{
            Constructor c=personClass.getConstructor(String.class);
            Object object=  c.newInstance("aduo");
            System.out.println(object.getClass().getName());
            System.out.println(object);
        }catch(NoSuchMethodException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
                e.printStackTrace();
        }
    }

}
interface  IMessage{

}
interface  SystemEdition{

}
class Father{

}
class Son extends Father implements  IMessage,SystemEdition{

}
class  Person{
    private String name;
    private Integer age;
    public Person(){
    }
    public Person(String name){
        this.name=name;
    }
    public Person(String name, Integer age){
        this.name=name;
        this.age=age;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
