package HelloWorld;
import designpattern.*;
import java.util.*;

/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */


public class hellowrold {
   /* public static void code1(){
   //单例模式
   //1.将类的构造方法私有化
   //2.类提供的静态方法返回实例化对象（3.内部提供的）
   //3.类内部实例化一个对象
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton==singleton1);
        singleton. print();
        singleton1. print();
    }*/

    public static void main(String[] args) {
        //多例模式
        Singleton5 gender=Singleton5.getInstance(1);
        Singleton5 gender1=Singleton5.getInstance(1);
        Singleton5 gender2=Singleton5.getInstance(0);
        //Object工具类
        if(Objects.nonNull(gender)) {
            System.out.println(gender.getValue());
        }
            //枚举测试
        //values()获取所有对象
            Gender[] genders1=Gender.values();
            for(Gender gender11:genders1){
                System.out.println(gender11);

             }
             //valueOf获取常量名
             System.out.println(Gender.valueOf("FEMALE"));
    }
}
