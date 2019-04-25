package threadWay;

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
/*
 守护线程
7.1 Java中线程分为两类：用户线程（非守护线程），守护线程
7.2 守护线程用来守护用户线程，通常守护线程业务是持续执行的代码
7.3 当JVM中最后一个用户线程退出，守护线程将和JVM一同退出
7.4 Thread对象创建默认是用户线程，如果要设置守护线程，必须在start之前调用setDaemon(true)
 */
public class testDaemon {
    public static void main(String[] args) {
        //创建线程默认就是用户线程
        //设置线程为守护线程SetDaemon（true），必须在start之前
        Thread threadA = new Thread(new MyDaemon(), "Thread-A");
        threadA.setDaemon(true);
        threadA.start();
        Thread threadB = new Thread(new MyDaemon(), "Thread-B");
        threadB.start();

       //主线程休眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.interrupt();//中断
        //threadB结束
        System.out.println("主线程结束");
    }
}
class  MyDaemon implements Runnable{
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
                System.out.println( Thread.currentThread().getName() + "发生中断");
            }
            System.out.println("线程名-" + Thread.currentThread().getName() + " 是否是守护线程：" +
                    Thread.currentThread().isDaemon());
        }
    }
}