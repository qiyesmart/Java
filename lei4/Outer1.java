 //初始化内部类
 public class Outer1{
   private  String msg="Hello Aduo";//	成员属性
   //内部类
    
   public  void fun1(){
		System.out.println("这是Outer的成员方法Outer1");
   }
   class Inner{
		private  String msg="Hello Inner";
      //成员方法
		public void print(){
		//System.out.println(this.outer.getMsg());
		System.out.println(Outer1.this.msg);//从内部类访问外部类成员属性
		Outer1.this.fun1();
   }
}
   public void fun(){
		Inner inner=new Inner();
		inner.print();
   }
   public String getMsg(){
	   return this.msg;
   }
}
