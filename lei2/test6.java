public class test6{
       public static void main(String[] args){
	   //实例化对象
	   //Person person=new Person("jack","男");
	   //通过setter方法给属性赋值
	   //person.setChinese(false);
	   //if(person.isChinese()){
		//     System.out.println("不是");
	   //}
	   //else{
	   //System.out.println("是");
	   //}
	   //匿名对象
	   //String person2=new Person("jack","男");
	   //getPersonInfo();
	   //System.out.println(person2);
	   //Person person3=new Person("女");
	   //System.out.println(person3.getPersonInfo());
	    Person person4=new Person("朵","女",20);
		System.out.println(Person.getNation());
	    System.out.println(person4.getPersonInfo());
	    System.out.println(Person.getNation());
	    Person person5=new Person("朵朵","女");
		System.out.println(Person.getNation());
	    System.out.println(person5.getPersonInfo());
	   }
}