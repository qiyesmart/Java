public class Test14{
	public static void main(String[] args){
		//Person person1=new Person();
		//person1.setName("阿朵");
		//person1.setAge(20);
		//System.out.println(person1.getPersonInfo());
		//Student student1=new Student("阿朵朵");
		//student1.setStudentNum("1847326");
		//System.out.println(student1.getStudentInfo());
		//子类对象可以赋给父类
		//Person person1=new Student("李四");
		//person1.info()//用谁new的调谁的
		//person1.Print();//父类私有，无法访问
		//Student student1=new Student("李四");
		//student1.print();
		//java的多态验证
		Person person1=new Person();//向上转型
		Person person2=new Student("aduo");
		Person person3=new Teacher();
		person1.who();
		person2.who();
		person3.who();
		//向下转型（少用）
		//对象 instanceof  类型
		//返回值是boolean   如果对象是由类型实例化的返回true，否则false；
		System.out.println(person1 instanceof Person);
		System.out.println(person2 instanceof Person);//继承
		System.out.println(person3 instanceof Person);
		System.out.println(person2 instanceof Person);
		//向下转型需要判断
		System.out.println(person1 instanceof Student);
		if(person1 instanceof Student){
			Student student=(Student)person1;
		}else{
			System.out.println("person1不是由Student创建的");
		}
		System.out.println("===================");
		Person person4=new Person();
		Person person5=new Student("aduo");
		Person person6=new Teacher();
		Teacher teacher1=new Teacher();
		printWhoMessage(person4);
		printWhoMessage(person5);
		printWhoMessage(person6);
		printWhoMessage(teacher1);
	}
	//向上转型可以实现参数统一
	public  static void printWhoMessage(Person person){
		person.who();
	}
}
class Person{
      private String name;
	  private int age;
	  //构造方法
	  public Person(){
		   System.out.println("这是person的构造方法");
	  }
	  public Person(String name){
		  this.name=name;
	  }
	 
	  public String getPersonInfo(){
	  return "姓名"+this.name+"年龄"+this.age;
	  }
	  public void info(){
		  System.out.println("阿朵是猪");
	  }
	  //get
	  public String getName(){
	  return this.name;
	  }
	  public int getAge(){
	  return this.age;
	  }
	  public void setName(String name){
	  this.name=name;
	  }
	   public void setAge(int age){
	  this.age=age;
	  }
	  //private void Print(){
		//  Syetem.out.println("person的print方法");
	  //}
	   public void who(){
		 System.out.println("我是谁");
	   }
}
//继承
//单继承
//子类继承父类的所有结构，但是能不能使用，取决于访问控制符
//实例化子类对象时，先调用父类构造方法，再调用子类构造方法
//Java中不支持多继承
//覆写 子类个父类定义了相同的参数和方法名，子类覆写的方法访问控制权限比父类的方法更大
//public>protected>default[package]>private
class Student extends Person{
	  private String studentNum;
	  //构造方法
	   public Student(String name){
		  //调用父类方法
		  //1.
		  //super(name);
		  //2.
		  //super(); //person有一个隐含无参数的构造方法，所以下面才能编译
		  this.setName(name);
		  System.out.println("这是student的构造方法");
	  }
	  public String getStudentInfo(){
	 //super指的是父类
	  this.info();
	  return "姓名"+this.getName()+"年龄"+this.getAge()+"学号"+this.studentNum;
	  }
	  //子类赋写父类的info方法
	    public void info(){
		  super.info();
		  System.out.println("阿朵是猪1");
	  }
	  
	  //get
	  public String gteStudentNum(){
	  return this.studentNum;
	  }
	  public void setStudentNum(String studentNum){
	  this.studentNum=studentNum;
	  }
	  //只是一个普通的方法，，恰好和父类方法名相同
	 // public void Print(){
		//  Syetem.out.println("Student的print方法");
	 // }
	 public void who(){
		 System.out.println("我是学生");
	 }
}
class Teacher extends Person{
	public void who(){
		 System.out.println("我是老师");
	 }
}
//final修饰
//class FinalClass{
   //final修饰成员变量必须初始化
//   private final String name;
   //常量
//   public static final int MAX_Age=120;
//   public FinalClass(){
//     this.name="java";
//	 }
//}
//class FinalSubClass extends FinalClass{

//}