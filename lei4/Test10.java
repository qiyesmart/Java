public class Test10{
   public static void main(String[]  args){
  
   //实例化一个内部类对象
   //1.类名 外部类.内部类
   //2.持有一个外部类的实例化对象
   Outer1 outer=new Outer1();
   Outer1.Inner inner=outer.new Inner();
   inner.print();
   }
 }