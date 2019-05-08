package testString;

/**
 * Author:QiyeSmart
 * Created:2019/5/8
 */
/*
Object类型接收接口
 */
public class testMessage {
    public static void main(String[] args) {
        // 子类向父接口转型
        IMessage msg= new MyMessage() ;
        // 接口向Obejct转型
        Object obj = msg ;
        System.out.println(obj);
        // 强制类型转换
        IMessage temp = (IMessage) obj ;
        temp.getMessage();
    }
}
class MyMessage implements  IMessage{
    public String toString() {
        return "I am small aduo" ;
    }
    public void getMessage() {
        System.out.println("阿朵朵");
    }
}