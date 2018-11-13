public class Person{
	//引用数据类型在类中作为属性创建对象时默认值是null
		//类属性
		private String name;
		private String gender;
		private double faceScore;
		//构造方法
		public Person(String name,String gender){
			this.name=name;
			this.gender=gender;
		}
		//行为
		void eat(){
		   System.out.println(name+"吃");
		   }
		void study(){
		   System.out.println(name+"学习");
		   }
		void play(){
		   System.out.println(name+"玩");
		   }
		   String getPersonInfo(){
			   return "姓名："+name+"性别："+gender+"颜值："+faceScore;
		   }
		   //getter
		  public String getName(){
			   return name;
		   }
		   public String getgender(){
			   return gender;
		   }
		   public double getFaceScore(){
			   return faceScore;
		   }
		   //setter
		   public void setFaceScore(double faceScore){
			   this.faceScore=faceScore;
		   }
}