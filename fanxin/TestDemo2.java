class Message<T extends Number> { // 设置泛型上限
	private T message ;
	public T getMessage() {
		return message;
	}
	public void setMessage(T message) {
		this.message = message;
	}
}
public class TestDemo2 {
		public static void main(String[] args) {
		Message<Integer> message = new Message() ;
		message.setMessage(55);
		fun(message);
	}
	// 此时使用通配符"?"描述的是它可以接收任意类型，但是由于不确定类型，所以无法修改
	public static void fun(Message<? extends Number> temp){
    	//temp.setMessage(100); 仍然无法修改！
		System.out.println(temp.getMessage());
	}
}