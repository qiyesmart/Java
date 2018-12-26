//通配符
class Message<T> {
	private T message ;
	public T getMessage() {
		return message;
	}
	public void setMessage(T message) {
		this.message = message;
	}
}
public class TestDemo1 {
	public static void main(String[] args) {
		Message<Integer> message = new Message() ;
		message.setMessage(99);
		fun(message); // 出现错误，只能接收String
	}
	public static void fun(Message<String> temp){
		System.out.println(temp.getMessage());
	}
}