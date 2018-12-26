class MyClass<T>{
	public void testMethod1(T t) {
		System.out.println(t);
	}
	public <T> T testMethod2(T t) {
		return t;
	}
}
public class Test {
	public static void main(String[] args) {
		MyClass<String> myClass = new MyClass<>();
		myClass.testMethod1("hello 泛型类");
		Integer i = myClass.testMethod2(100);
		System.out.println(i);
	}
}