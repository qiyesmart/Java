 
 public class Outer{
	  public static void main(String[]  args){
   //Outer outer=new Outer();
   //outer.fun();
   //Outer outer=new Outer();
   //outer.fun();
   //Inner inner=new Inner(outer);
   //inner.print();
	  }
   //实例化一个内部类对象
   //1.类名 外部类.内部类
   //2.持有一个外部类的实例化对象
   Outer outer=new Outer();
   Outer.Inner inner=outer.new Inner();
   inner.print();
   }
   private  String msg="Hello Aduo";//	成员属性
   //内部类
   public  void fun1(){
		System.out.println("这是Outer的成员方法Outer1");
   }
   public void fun(){
		Inner inner=new Inner(this);
		inner.print();
   }
   public String getMsg(){
	   return this.msg;
   }
}

 class Inner{
		private  String msg="Hello Inner";
		Outer outer;
		//构造方法
		Inner(Outer outer){
			this.outer=outer;
		}
      //成员方法
      public void print(){
		System.out.println(this.outer.getMsg());
		//System.out.println(Outer.this.msg);//从内部类访问外部类成员属性
		this.outer.fun1();
   }
}