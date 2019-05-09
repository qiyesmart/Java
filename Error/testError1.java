package Error;

/**
 * Author:QiyeSmart
 * Created:2019/5/9
 */
/*
一个代码块有多种异常应对应多个catch块
 */
public class testError1 {
    public static void code1(){
       /* System.out.println("1.开始计算前...");
        try {
            //也会产生ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(args[0]);
            System.out.println("2.开始计算..." + (10 / 0));
        }catch(Exception e){
            //多个异常具有相同的父类，可以yoga父类直接代替
            e.printStackTrace();
        }
      // /* } catch (ArithmeticException e) {
      //      //打印错误产生的堆栈信息
      //      e.printStackTrace();
      //  }catch(ArrayIndexOutOfBoundsException e){
       //     e.printStackTrace();
       // }
        finally {
            System.out.println("3.计算结束...");
        }*/
    }
    public static void fun(){
        fun();
    }
  public static void code2(){
      //Error异常捕获
      System.out.println("1.开始计算前...");
      try {
          System.out.println("2.开始计算..." + (10 ));
          fun();
      }catch(Error e){
          //多个异常具有相同的父类，可以yoga父类直接代替
          e.printStackTrace();
      }
      finally {
          System.out.println("3.计算结束...");
      }
  }
    public static int calculate(int x,int y) throws Exception {
        return x/y ;
    }
    public static void main(String[] args) {
        //throws将异常扔给主方法处理
        /*try {
            System.out.println(calculate(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //throw 自己产生异常
        try {
          throw new Exception("抛个异常玩玩") ;
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}
