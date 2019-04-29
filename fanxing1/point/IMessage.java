package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型接口定义和泛型类区别不大；
    //泛型接口的实现类：泛型类（保留参数类型声明），泛型类（接口处指定具体类型）
public interface IMessage<T> {
    void print(T t);
    public static void main(String[] args){
        IMessage<Integer> in=new QQMessage<>();
        IMessage<String> str=new MsnMessage();
        in.print(3);
        str.print("aduo");
        //类型消除
        //编译时的功能扩展，运行时擦除翻新信息
        //如果之前泛型类中的类型参数部分如果没有指定上限，如  <T> 则会被转译成普通的Object 类型
        //如果指定了上限如  <T extends String> 则类型参数就被替换成类型上限
        QQMessage<Integer> intQQ=new QQMessage<>();
        QQMessage<Integer> strQQ=new QQMessage<>();
        System.out.println(intQQ.getClass()==strQQ.getClass());
        System.out.println("intQQ.getClass:"+intQQ.getClass());
        System.out.println("strQQ.getClass:"+strQQ.getClass());

    }
}

class QQMessage<T> implements IMessage<T>{
    public void print(T t){
        System.out.println(t);
    }
}
//不是泛型类
class MsnMessage implements IMessage<String> {
    public void print(String s) {
        System.out.println(s);
    }
}
