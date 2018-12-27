class Message<T> {
	private T message ;
	public T getMessage() {
		return message;
	}
	public void setMessage(T message) {
		this.message = message;
	}
}
public class TestDemo3 {
	public static void main(String[] args) {
		Message<String> message = new Message() ;
		message.setMessage("Hello World");
		fun(message);
	}
	public static void fun(Message<? super String> temp){
    	// 此时可以修改！！
    	temp.setMessage("bit!");
		System.out.println(temp.getMessage());
	}
}