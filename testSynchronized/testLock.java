package testSyc;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Author:QiyeSmart
 * Created:2019/4/28
 */
//Lock锁的使用
public class testLock {
    public static void main(String[]  args){
        final Lock lock=new ReentrantLock();
        Runnable runnable=new MyLock(lock);
        new Thread(runnable,"黄牛A").start();
        new Thread(runnable,"黄牛B").start();
        new Thread(runnable,"黄牛C").start();
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("main结束");
        }

    }

}
class MyLock implements Runnable{
    private final Lock lock;
    private int tick=10;
    public MyLock(Lock lock){
        this.lock=lock;
    }
    public void run() {
        while (this.tick > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //tick访问并修改
            lock.lock();
            //需要进行同步的代码块
            try {
                if(this.tick > 0) {
                    System.out.println(Thread.currentThread().getName() + " 卖票， 剩余 ：" + (--this.tick));
                }
                }finally{
                lock.unlock();
            }
        }
    }

}