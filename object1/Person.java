class Person{
	private String name ;
	private int age ;
	public Person(String name, int age) {
		this.age = age ;
		this.name = name ;
	}
}
class Student{}
	public class Test {
		public static void main(String[] args) {
			fun(new Person("yuisama",25) );
			fun("Hello");
			}
		public static void fun(Object obj) {
			System.out.println(obj.toString()); // 默认输出对象调用的就是toString()方法
		}
}