package designpattern;

/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
public class Singleton {
    //饿汉式
    //private static Singleton singleton=new Singleton();
    // 懒汉式(存在线程不安全)
    private static Singleton singleton=null;
       private Singleton() {

       };
       public static Singleton getInstance(){
           //懒汉式（只能单线程使用）
           if(singleton==null){
               System.out.println("实例化");
               singleton=new Singleton();
           }
           return singleton;
       }
       public void print(){
           System.out.println("这是普通方法");
       }

}
