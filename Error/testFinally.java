package Error;

/**
 * Author:QiyeSmart
 * Created:2019/5/9
 */
public class testFinally {
    //finally一定会被执行
    public static int test(){
        try {
            System.out.println(10);
            return 0;
        } catch (ArithmeticException e) {
            return 1;
        } finally {
            return 2;
        }
    }
    //无法执行finally
    public static void test1(){
        try {
            System.out.println(1);
            //系统推出
           System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println(2);
        } finally {
            System.out.println(3);
        }
    }
    public static void main(String[] args) {
        testFinally str=new testFinally();
       str.test1();
    }
}
