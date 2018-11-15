//类的多继承
public class Test11{
	public static void main(String[] args){
		Outer outer=new Outer();
		System.out.println(outer.name());
	    System.out.println(outer.age());
	    Outer.C c=new Outer.C();
		System.out.println(c.info("阿朵"));
}
}
class A{
     private String name="A的属性";
	 public String getName(){
	 return this.name;
	 }
}
class B{
     private int age=20;
	 public int  getAge(){
	 return this.age;
	 }
}
class  Outer{
    class InnerA extends A{
		public String getName(){
			return super.getName();
		}
	}
	 class InnerB extends B{
		public int getAge(){
			return super.getAge();
		}
	}
	public String name(){
		return new InnerA().getName();
	}
	public int age(){
		return new InnerB().getAge();
	}
	//静态内部类
	static class C{
		public String info(String name){
			return "欢迎"+name;
		}
	}
}