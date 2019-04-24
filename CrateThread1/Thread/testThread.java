package Thread;

/**
 * Author:QiyeSmart
 * Created:2019/4/24
 */
//第一种方式

        //1. Thread 关联的是本地线程
        //2. 实现了 Runnable接口  run()-> target.run()

//普通的Thread接口实现多线程
public class testThread {
    public static void main(String[] args) {

        System.out.println("这是主方法开始");//1

        MyThread myThread1 = new MyThread("MyThread1");
       MyThread myThread2 = new MyThread("MyThread2");
       MyThread myThread3 = new MyThread("MyThread3");
       //普通的run方法无法启动线程，不能直接调用run方法
       // myThread1.run();
       // myThread2.run();
       // myThread3.run();
        // start()此方法会自动调用线程的run()方法
        myThread1.start();
        myThread2.start();
        myThread3.start();
        //for (int i = 0; i < 10; i++) {//3
        //    System.out.println("这是主方法的循环：" + i);
        //}
        // myThread1.start();
        //System.out.println("这是主方法结束");//4

    }
}
 class MyThread extends Thread {

    private String title;

    public MyThread(String title) {
        this.title = title;
    }

    public void run() {
        System.out.println("run 开始");//1
        for (int i = 0; i < 10; i++) {//2
            System.out.println(this.title + "  " + i);
        }
        System.out.println("run 结束");//3
    }

}