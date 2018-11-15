public class Test12{
	public static void main(String[] args){
		Outer outer=new Outer();
		outer.display(10);
		Test12.hello("阿朵是猪");
	}
		//静态类
		public static void hello(String test){
			//匿名类
		new A(){
				public void gretting(String name){
					name="李四";
					 System.out.println("欢迎"+name);
					  System.out.println(test);
				 }
		}.gretting("aduo");	
	}
}
class  Outer{
       private int num=10;
	   public void display(int test){
		//方法内部类
	    class Inner{
		public void print(){
		System.out.println("num="+num);
		System.out.println("test="+test);
		}
	}
	new Inner().print();
	}
}
//接口
interface A{
	 void gretting(String name);
}