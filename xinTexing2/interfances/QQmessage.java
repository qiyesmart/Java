package interfances;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
public class QQmessage implements  Message {
    public void print(){
        System.out.println("QQ message print");
    }
    //接口的普通方法不完美可以重新覆写
    public void greeting(){
        System.out.println("沟通多一点");
    }
}
