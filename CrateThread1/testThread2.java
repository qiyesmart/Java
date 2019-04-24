/**
 * Author:QiyeSmart
 * Created:2019/4/24
 */
         //第二种方式

        //1. MyRunnable 实现了Runnable
        //2. Runnable的实现类的实例化对象
        //3. new Thread(Runnable target)
public class testThread2 {
    //使用Runnable接口实现单线程
    public static void code1() {
        Runnable runnable = new MyRunnable("MyRunnable");

        System.out.println("main开始");

        Thread myThread = new Thread(runnable);
        myThread.start();//start()->start0()->run()->target.run()->runnable.run()
        for (int i = 0; i < 10; i++) {
            System.out.println("main " + i);
        }
        System.out.println("main结束");
    }
    //使用Lamada表达式
    public static void code2(){
        System.out.println("main开始");
        Thread myThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("runnable " + i);
            }
        });
        myThread.start();//start()->start0()->run()->target.run()->runnable.run()
        for (int i = 0; i < 10; i++) {
            System.out.println("main " + i);
        }
        System.out.println("main结束");
    }
    //使用Runnable接口实现多继承
    public static void code3(){
        System.out.println("main开始");
        Runnable runnable = new MyRunnable("MyRunnable");

        //Thread类提供的构造方法:
        //public Thread(Runnable target)
        //可以接收Runnable接口对象
        Thread myThread1 = new Thread(runnable);
        myThread1.start();
        Thread myThread2 = new Thread(runnable);
        myThread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main " + i);
        }
        System.out.println("main结束");
    }

    public static void main(String[] args) {



        //1.Runnable     代理接口
        //2.MyRunnable implements Runnable  业务类
        //3.Thread     implements Runnable  代理类
        //  Runnable实现多线程就是一个典型的代理模式


    }

}
class MyRunnable implements Runnable {

    private String title;

    MyRunnable(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.title + " " + i);
        }
    }
}