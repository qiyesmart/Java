public class ChouxiangLei{
     public static void main(String[] args){
	 //Person per=new Student(); //实例化子类，向上转型
	 //per.gtePersonInfo(); //被子类所覆写的方法
	  //Person1 per=Person1.getInstance(); 
	 //per.gtePersonInfo(); //被子类所覆写的方法
	 //new Student();
	 new B(30);
	 }
	 }
abstract class Person{
   private String name;//属性
   //构造方法
   public Person(){
	   System.out.println("这是父类构造方法");
   }
	   
   public String getName(){
       return this.name;
	   }
	   public void setName(String name){
	    this.name=name;
		}
		//方法体，抽象方法上不包含方法体
		public  abstract  void gtePersonInfo();//抽象方法
}
class Student extends Person{
	 public Student(){
	   System.out.println("这是子类构造方法");
   }
      public void gtePersonInfo(){
	  System.out.println("我是个学生");
	  }
}
//于非正常模式，但是对于一些封装性有一定好处（封装具体子类），不属于开发首选
/*abstract class Person1{
   private String name;
   public String getName(){
       return this.name;
	   }
	   public void setName(String name){
	    this.name=name;
		}
		//方法体，抽象方法上不包含方法体
		public  abstract  void gtePersonInfo();//抽象方法
		//取得A类对象
		public static Person1 getInstance(){
			//定义内部类
			class Student extends Person1{
      public void gtePersonInfo(){
	  System.out.println("我是个学生");
	  }
   }
   return new Student();
	}
}*/
//如果父类没有无参构造，那么子类构造必须使用super明确指出使用父类哪个构造方法。
//如果构造方法，那么对象中的属性一定都是其对应数据类型的默认值。
abstract class A{
	public A(){//3.调用父类构造
		this.print();//4.调用被子类覆写的方法
	}
	public abstract void print();
}
class B extends A{
	private int num=100;
	public B(int num){//2.调用子类实例化对象
		super();//3.隐含一行话，实际先要调用父类构造
		this.num=num;//7.为类中属性初始化
	}
	public void print(){//5.此时子类的对象还没有被初始化
		System.out.println(this.num);//6.对于其数据类型的默认值
	}
}
