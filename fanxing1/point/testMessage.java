package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
public class testMessage {
    public static void fun(Message<String> message){
        System.out.println(message. getMessage());
    }
    //泛型通配符
    //?表示可以是任意类型，但是要求不能对message对象进行修改
    public static void fun2(Message<?> message){
        System.out.println(message. getMessage());
    }
    //泛型的上限
    //上限用在方法参数，参数内容可修改
    public static void fun3(Message<?extends CharSequence> message){
        System.out.println(message. getMessage());
    }
    //泛型的下限
    //下限用在方法参数，参数内容可修改
    public static void fun4(Message< ? super String> message){
        System.out.println(message. getMessage());
    }

    public static void main(String[] args){
        //Message<String>  me=new Message<>();
        //me.setMessage("aduo");
        //(me);
        //出错
        //Message<Integer>  me=new Message<>();
        // me.setMessage(1);
       // fun(me);
        //上限测试
        Message<StringBuffer>  me=new Message<>();
        me.setMessage(new StringBuffer().append("java").append("aduo"));
         fun3(me);
         //下限测试
        Message<String>  me2=new Message<>();
        me2.setMessage("aduo");
        fun4(me2);
    }
}




