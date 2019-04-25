package threadWay;

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
//线程优先级
/*
Java中线程具有优先级，优先级越高的线程约有可能先执行
线程的优先级 0-10
通过thread对象的setPriority(int v), getPriority()方法用来修改和获取线程的优先级
main线程的优先级是 5
线程的优先级具有继承性，比如：线程A的优先级是v,那么在线程A中创建的线程优先级默认就是v
 */
public class testPriority {
    public static void main(String[] args) {
    Thread  thread1=new MyPriority();
    //thread1.setName("Thread1");
    //thread1.setPriority(Thread.MAX_PRIORITY);
        //Thread  thread2=new MyPriority();
       // thread2.setName("Thread2");
       // thread2.setPriority(Thread.NORM_PRIORITY);
        Thread thread3 = new MyPriority();
        thread3.setName("Thread-3");
        thread3.setPriority(Thread.MIN_PRIORITY);
        //thread1.start();
        //thread2.start();
        thread3.start();
        System.out.println("main priority : " + Thread.currentThread().getPriority());
    }
}
class MyPriority  extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" "+this.getPriority());
            //进程中创建进程
            //线程的优先级具有继承性，比如：线程A的优先级是v,那么在线程A中创建的线程优先级默认就是v
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
                }
            }, Thread.currentThread().getName() + i);
            thread.start();
        }
    }
}
