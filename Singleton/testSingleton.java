package Singleton;


/**
 * Author:QiyeSmart
 * Created:2019/5/9
 */
/*
单例设计方法
*/

public class testSingleton {
    public static void main(String[] args) {
        //恶汉式
        Singleton2 singleton1=Singleton2.getInstance();
        Singleton2 singleton2=Singleton2.getInstance();
        System.out.println(singleton1==singleton2);
    }
}
//恶汉式
/*
class Singleton1{
    //2.产生唯一的一个对象
    private static final Singleton1  singleton=new Singleton1();
    //1.构造方法私有化
    //限制在外部产生对象的方法
    private Singleton1(){
    };
    public static Singleton1 getInstance(){
        return singleton;
    }
}*/
class Singleton2{
    //2.产生唯一的一个对象
    private static  Singleton2  singleton;
    //1.构造方法私有化
    //限制在外部产生对象的方法
    private Singleton2(){
    };
    public static Singleton2 getInstance(){
        if(singleton==null){
            singleton=new Singleton2();
        }
        return singleton;
    }
}