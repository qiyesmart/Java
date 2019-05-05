package interfances;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
/*
接口：
1.定义常量；
2.定义抽象方法；
3.通过default定义普通方法，实现类可以根据实际使用情况覆写该方法；
4。定义静态方法
 */
public interface Message {
    //定义普通方法
    default void greeting(){
        System.out.println("default greeting");
    }
    static void messageInfo(){
        System.out.println("这是Message接口的静态方法");
    }
    void print();
    public static  void main(String[] args){
        Message qq=new QQmessage();
        qq.print();
        qq.greeting();
        //接口内部的静态方法可以通过接口名调用
        Message.messageInfo();

    }
}
