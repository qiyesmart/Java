package testSyc;

/**
 * Author:QiyeSmart
 * Created:2019/4/28
 */
//synchronized 实现对同一个类的同步代码块进行枷锁
public class testSycThread{
    //锁多个对象无法实现同步测试实例
    /*
    public static void  code1() {
        for (int i = 0; i < 3; i++) {
            Thread thread = new MySyncThread1();
            thread.start();
        }
    }*/
    //锁当前this对象测试实例
    /*public static void code2(){
        Sync sync = new Sync();
        for (int i = 0; i < 3; i++) {
            Thread thread = new MySyncThread2(sync);
            thread.start();
        }
    }*/
    //锁类对象测试实例
    /*
    public static void code3(){

        for (int i = 0; i < 3; i++) {
            Thread thread = new MySyncThread1();
            thread.start();
        }
    }*/
    public static void main(String[] args) {
         //通过lock锁锁方法同一对象
        final Object lock = new Object();
        for (int i = 0; i < 10; i++) {
            Thread thread = new MySyncThread3(lock);
            //Thread-Sync-0 .. Thread-Sync-9
            //Sync(lock)   ...    Sync(lock)
            //lock 同一个对象
            //Sync test lock(同步)
            thread.setName("Thread-Sync-" + i);
            thread.start();
        }
    }


}
class Sync{


    /*public synchronized   void test(){
        System.out.println("test执行开始，当前线程："+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("test执行结束，当前线程"+Thread.currentThread().getName());
    }*/
    //锁多个方法的this对象
    /*
    public    void test() {
        synchronized (this) {
            System.out.println("test执行开始，当前线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test执行结束，当前线程" + Thread.currentThread().getName());
        }
    }*/
    //synchronized(Sync.class)实现了全局锁的效果
    /*public    void test() {
        synchronized (Sync.class) {
            System.out.println("test执行开始，当前线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test执行结束，当前线程" + Thread.currentThread().getName());
        }
    }*/
    //同过Lock锁锁统一对象
    private final Object lock;

    Sync(Object lock) {
        this.lock = lock;
    }
    public    void test() {
        synchronized (lock) {
            System.out.println("test执行开始，当前线程：" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test执行结束，当前线程" + Thread.currentThread().getName());
        }
    }
}

/*class MySyncThread1 extends Thread{

public void run(){
        Sync sync=new Sync();
        sync.test();
        }
}*/


class MySyncThread2 extends Thread {
    private Sync sync ;
    public MySyncThread2(Sync sync) {
        this.sync = sync ;
    }

    public void run() {
        sync.test();
    }
}
class MySyncThread3 extends Thread {
    private final Object lock;

    MySyncThread3(Object lock) {
        this.lock = lock;
    }
    public void run() {
        Sync sync = new Sync(lock);
        sync.test();
    }
}
