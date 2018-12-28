class Person1{
	private String name ;
	private int age ;
	public Person(String name, int age) {
		this.age = age ;
		this.name = name ;
	}
	public String toString() {
		return "姓名："+this.name+",年龄："+this.age ;
	}
}
class Student1{}
	public class Test {
		public static void main(String[] args) {
			String msg = "Hello " + new Person("yuisama", 25) ;
			System.out.println(msg);
		}
	public static void fun(Object obj) {
		System.out.println(obj.toString()); // 默认输出对象调用的就是toString()方法
	}
}