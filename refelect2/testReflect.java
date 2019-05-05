package refelect;
import java.util.Date;
/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
/*
1.反射通过对象获取创建对象的类型信息
2.对类型的一个抽象，就是JDK中的Class类
3.class对象获取方式：
   通过对象的getClass方法获取，比如obj.getClass（）。
   通过类名。class获取类的class对象
   通过Class类的静态方法.forname(string)获取class对象，捕获异常
4.通过Class对象的方法newInstance获取实例化对象，类型中必须有默认的无参构造方法
5.工厂模式（简单工厂）结合反射使用，能够减少功能扩展带来的工厂修改问题
6.Class对象可以获取包名，父类，接口，构造方法,普通方法，获取属性（父类公开，子类所有）
7.通过Class对象获取勒种指定的Constructor，通过Constructor对象的newInstance方法实例化对象

 */
public class testReflect {
    public static void main(String[]  args){
        //调用类名，调用构造方法，创建对象
       Date date=new Date();
       //通过date对象获取创建date对象的类的对象
        //JAVA中java.util.Date这个类->在程序中获得一个class对象，描述Date这个类
       Class classz=date.getClass();
       // 通过对象的getClass方法获取
       System.out.println(classz.getName());
       //类名。class获取类的class对象
        Class classz1=Date.class;
        System.out.println(classz==classz1);
        //类的全限定名称（包含包名）
        try{
            Class classz2=Class.forName("java.util.Date");
            System.out.println(classz==classz2);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("-----------------------------------");
        //class对象创建实例化对象（类型中必须有默认的无参构造方法）
        try{
            Object object=classz.newInstance();
            if(object instanceof  Date){
                Date date1=(Date)object;
                System.out.println(date1);
            }
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }

    }
}
