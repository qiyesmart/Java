public class Person{
	//引用数据类型在类中作为属性创建对象时默认值是null
		//类属性
		private static String nation="中华民族";
		//对象属性
		private String name;
		private String gender;
		private double faceScore;
		private boolean chinese;//（默认是false）
		//静态块
		static{
		 System.out.println("这是Person的静态");
		}
		//构造块
		{
		 System.out.println("这是Person的构造块");
		}
		//构造方法（用于初始化，编译器是根据程序结构来区分普通方法与构造方法的，所以在构造方法前没有返回值类型声明）
		//构造方法参数由少到多写
		//重载构造方法可以提升简便性
		public  Person(){
			System.out.println("这是Person的构造方法");
		}
		public Person(String name){
			this.name=name;
		}
		public Person(String name,String gender){
			this.name=name;
			this.gender=gender;
		}
		public Person(String name,String gender,double faceScore){
			this.name=name;
			this.gender=gender;
			this.faceScore=faceScore;
		}
		//直接调用构造方法(this调用放第一行)
		//public  Person(){
		//	System.out.println("这是一个逻辑");
		//}
		//public Person(String name){
		//	this();  //(调用无参构造方法)
		//	this.name=name;
		//}
		//public Person(String name,String gender){
		//	this(name);
		//	this.gender=gender;
		//}
		//public Person(String name,String gender,double faceScore){
		//	this(name,gender);
		//	this.faceScore=faceScore;
		//}
		   //初始化
		   String getPersonInfo(){
			   //访问static属性（类属性）应使用类名称.属性名
			   Person.nation="未知";
			   return "姓名："+name+"性别："+gender+"颜值："+faceScore+"是否中国人："+(this.chinese?"是":"否");
		   }
		   //静态方法
		     public static String getNation(){
			   return Person.nation;
		   }
		   //普通方法
		   void eat(){
		   System.out.println(name+"吃");
		   }
		void study(){
		   System.out.println(name+"学习");
		   }
		void play(){
		   System.out.println(name+"玩");
		   }
		   //getter
		  public String getName(){
			   return this.name;
		   }
		   public String getgender(){
			   return this.gender;
		   }
		   public double getFaceScore(){
			   return this.faceScore;
		   }
		   //boolean的个体方法有所不同
			public boolean isChinese(){
			   return this.chinese;
		   }
		   //setter
		   public void setFaceScore(double faceScore){
			   this.faceScore=faceScore;
		   }
		    public void setChinese(boolean chinese){
			   this.chinese=chinese;
		   }
}