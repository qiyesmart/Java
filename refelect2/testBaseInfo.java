package refelect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.lang.reflect.Method;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
public class testBaseInfo {
    public static void code1(){
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
            System.out.println(c.getName()+"("+Arrays.toString(c.getParameterAnnotations())
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
    public static void code3(){
        //取得全部普通方法
          Person person=new Person("jack",20);
        Class personClass=person.getClass();
        Method[] methods=personClass.getMethods();
        System.out.println("Person类中的所有方法");
        for(Method m:methods){
            System.out.println(m.getName()+"("+Arrays.toString(m.getParameterTypes())+")");
        }
        //取得指定普通方法
        try{
            // 取得setName这个方法的实例化对象,设置方法名称与参数类型
            Method setNameMethod=personClass.getMethod("setName",String.class);
            // 随后需要通过Method类对象调用指定的方法，调用方法需要有实例化对象
            // 同时传入参数
            //相当于Person对象.setName("aduo") ;
            // 任何时候调用类中的普通方法都必须有实例化对象
            Object returnValue=setNameMethod.invoke(person,"aduo");
            System.out.println(returnValue);
            System.out.println(person);
          }catch(NoSuchMethodException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(InvocationTargetException e){
            e.printStackTrace();
        }
        System.out.println("---------------------------------------");
        //取得父类所有公开属性
        Class student=Student.class;
        Field[]  fileds=student.getFields();
        for(Field f:fileds){
            System.out.println(f.getName()+""+f.getType());
        }
        //取得父类指定属性
        try{
            Field ageField=student.getField("age");
            System.out.println(ageField.getName()+""+ageField.getType());
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }
        System.out.println("---------------------------------------");
        //取得本来所有属性
        Field[]  fields1=student.getDeclaredFields();
        for(Field f:fields1){
            System.out.println(f.getName()+""+f.getType());
        }
        //取得本类指定属性
        try{
            System.out.println(student.getDeclaredField("school"));
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){

         //操作属性内容
       Student2 student=new Student2();
       student.setName("aduo");
       student.setAge(22);
       Class studentClass=Student2.class;
        try{
            System.out.println("Student对象信息:"+student);
            Field  schoolField=studentClass.getDeclaredField("school");
            System.out.println(schoolField.get(student));
        }catch(NoSuchFieldException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
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
    private  Integer age;
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

class   Student  extends  Person{

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

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                '}';
    }

}
class   Student2 extends Person {

    private String name;
    private Integer age;

}

