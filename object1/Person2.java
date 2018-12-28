class Person2{
	//实现对象比较
	private String name ;
	private int age ;
	public Person(String name, int age) {
		this.age = age ;
		this.name = name ;
	}
	public String toString() {
		return "姓名："+this.name+",年龄："+this.age ;
	}
	public boolean equals(Object obj) {
		if (obj == null) {
		return false ;
	}
	if(this == obj) {
		return true ;
	}
	// 不是Person类对象
	if (!(obj instanceof Person)) {
		return false ;
	}
	Person person = (Person) obj ; // 向下转型，比较属性值
	return this.name.equals(person.name) && this.age==person.age ;
	}
}
class Student2{}
	public class Test {
		public static void main(String[] args) {
			Person per1 = new Person("yuisama", 20) ;
			Person per2 = new Person("yuisama", 20) ;
			System.out.println(per1.equals(per2));
	}
}