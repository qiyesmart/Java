public class TestObject{
	public static void fun(Object obj) {
	System.out.println(obj);
	}
	public static void code1(){
		Person person1=new Person();
		fun(person1);
		fun(new Person());
		fun("hello");
		//包装类型
		fun(123);
	}
	public static void code2(){
		//覆写toString方法（输出内容）
		Person person=new Person();
		person.setName("aduo");
		person.setAge(18);
		System.out.println(person);
		//覆写equals方法
		Person person1=new Person();
		person1.setName("Jack");
		person1.setAge(18);
		
		Person person2=person;
		System.out.println(person.equals(person1));
		System.out.println(person.equals(person2));
	}
	public static void code3(){
		//任意类型对象赋值给Object对象
		//接受数组对象
		Object obj=new int[]{1,2,3,4,5};
		int[] intArray=(int[])obj;
		/*
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]+",");
		}*/
		//增强的for循环，foreach
		//数组，List（迭代器）
		for(int value:intArray){
			System.out.println(value+",");
		}
		System.out.println("----------------");
		IMessage  im=new BitIMessage();
		System.out.println(im.greeting());
		Object obj1=im;//向上转型
		System.out.println(obj1);
		IMessage im1=(IMessage)obj1;//向下转型
		System.out.println(im1.greeting());
	}
	public static void code4(){
		//int包装
		IntWrapper intWrapper=new IntWrapper(123);
		System.out.println(intWrapper);
		Object obj=intWrapper;
		System.out.println(intWrapper);
		//基本数据类型的包装
		System.out.println("----------------");
		//装箱（手动）
		Integer intValue=new Integer(666);
		//装箱（自动）
		//Integer intValue=666;
		Object obj2=intValue;
		Number number1=intValue;
		fun(obj2);
		fun(number1);
		//拆箱（手动）
		//int intValue4=intValue3.intArray();
		//拆箱（自动）
		//int intValue2=intValue
	}
	public static void main(String[] args){
		//int类型转换
		String str="123";
		int intValue=Integer.parseInt(str);
		System.out.println(intValue);
		//把str当做16进制
		System.out.println(Integer.parseInt(str,16));
		
		//字符串转基本数据类型
		//第一种方式 +
		//第二种方式  String.valueOf()；
		String intStr=String.valueOf(123);
		String booleanStr=String.valueOf(true);
		String charArrayStr=String.valueOf(new char[]{'a','b'});
		System.out.println(intStr);
		System.out.println(booleanStr);
		System.out.println(charArrayStr);
	}
}
interface IMessage{
	String greeting();
}
class BitIMessage implements IMessage{
	public String greeting(){
		return "aduo";
	}
}
//int包装
final class IntWrapper{
	private final int num;
	public IntWrapper(int num){
		this.num=num;
	}
	public int getNum(){
		return this.num;
	}
	public String toString(){
	return this.num+"";
    }
}
//覆写toString方法（输出内容）
class Person{
	private String name;
	private int age;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "名字"+this.getName()+"年龄"+this.getAge();
	}
	//覆写equals方法
	public boolean equals(Object obj){
		//先比较地址
		if(obj==null){
			return false;
		}
		if(this==obj){
			return true;
		}
		//比内容
		if(obj instanceof Person){
			Person that=(Person)obj;
			return this.name.equals(that.getName())&&
			this.age==that.getAge();
		}
		return false;
	}
}
