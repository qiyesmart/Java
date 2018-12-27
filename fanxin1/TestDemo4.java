// 在接口上定义了泛型
interface IMessage<T> { 
	public void print(T t) ;
}
class MessageImpl implements IMessage<String> {

	public void print(String t) {
		System.out.println(t);
	}
}
public class TestDemo4 {
	public static void main(String[] args) {
		IMessage<String> msg = new MessageImpl() ;
		msg.print("Hello World");
	}
}