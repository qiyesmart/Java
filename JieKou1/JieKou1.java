//1.接口里定义抽象方法
//2.接口里定义常量
//3.JDK7-11接口的一些变量（默认方法，静态方法）
//4.接口是无法实例化的，只能通过实现类
//5.接口是多实现，实现类能够实现多个接口；
//6.接口实现类，可以向上转型成 它实现的任意一个接口类型
//9.子类继承父类或者实现接口，先写继承，再写实现
//10.抽象类可以实现多个接口，并且接口方法抽象类可以不用实现，也可以实现
//11.接口不能继承类
public class JieKou1{
	//也可实现参数统一化
	public static void printIMessageInfo(IMessage imessage){
		imessage.getInfo();
	}
	public static void printSupportPlatform(Platform platform){
		platform.supportPlatform();
	}
	public static void main(String[] args){
	QQMessage imessage=new  QQMessage();
	//QQMeaasge实例化对象  向上转型成 IMessage类型
	((IMessage)imessage).getInfo();
	//QQMeaasge实例化对象  向上转型成 Platform类型
	((Platform)imessage).supportPlatform();

	MsnMessage imessage1=new  MsnMessage();
	((IMessage)imessage1).getInfo();
	((Platform)imessage1).supportPlatform();
	
	//强制类型转换
	IMessage imessage2=new QQMessage();
	Platform platform=(Platform)imessage;
	if(imessage instanceof Platform){
		 System.out.println("imessage 对象是 Platform类型的实例化对象");
	}else{
		 System.out.println("imessage 对象不是 Platform类型的实例化对象");
	}
	platform.supportPlatform();
	//参数统一化测试
	 System.out.println("----------------------------");
	 printIMessageInfo(imessage);
	 printSupportPlatform(imessage);
	 Company company=imessage;
	 company.producter();
	 //接口继承接口
	  System.out.println("----------------------------");
	 Combination combination=imessage;
	combination.getInfo();
	combination.supportPlatform();
	//静态内部接口
	  System.out.println("----------------------------");
	 A.B b=new C();
	 b.printB();
	
}
}

interface IMessage{
	//7.在接口中定义的变量实际上是常量，被public static final修饰
     String MSG="Hello Bitter";//全局常量
	//8.接口中定义的方法时一个抽象方法，默认是public abstract 修饰
	  void getInfo();//抽象方法
	
}
interface Platform{
     public abstract void supportPlatform();//抽象方法
}
//接口的实现类
class QQMessage extends Company implements Combination{
  //实现
  public  void getInfo(){
  System.out.println("Hello Aduo");
	}
	public  void supportPlatform(){
		 System.out.println("Hello Aduo1");
	}
	public  void producter(){
		System.out.println("腾讯出品");
	}
		
}
class MsnMessage implements IMessage,Platform{
  //实现
  public  void getInfo(){
  System.out.println("Hello Aduo2");
	}
	public  void supportPlatform(){
		 System.out.println("Hello Aduo3");
	}
}
//静态内部接口
interface A{
	void printA();
	//内部接口
	static interface B{
		void printB();
	}
}
class C implements A.B{
	public void printB(){
		 System.out.println("Hello Aduo4");
	}
}


  
