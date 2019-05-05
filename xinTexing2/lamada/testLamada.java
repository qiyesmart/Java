package lamada;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
public class testLamada {
  public static void  main(String[]  args){
      /*IMessage m=new IMessage(){
          @Override
          public void print() {
              System.out.println("IMessage实现类");
          }
      };
      m.print();
      */
      //
      //Lamada函数式编程
      IMessage m = () -> System.out.println("Hello World");
      m.print();

    }
}
