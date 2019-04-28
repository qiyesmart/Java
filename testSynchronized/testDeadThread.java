package testSyc;

/**
 * Author:QiyeSmart
 * Created:2019/4/28
 */
//死锁
public class testDeadThread {
    public static void main(String[] args){
        Pen pen=new Pen();
        Book book=new Book();
        new Thread(new Runnable() {
            public void run() {
                synchronized(pen) {
                    System.out.println(Thread.currentThread().getName() + " 我有笔，没有本");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(book) {
                        System.out.println(Thread.currentThread().getName() + " 我有笔，有本");
                    }
                }
            }
        }, "Thread-A").start();
        new Thread(new Runnable() {
            public void run() {
                synchronized(book) {
                    System.out.println(Thread.currentThread().getName() + " 我有笔，没有本");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized(pen) {
                        System.out.println(Thread.currentThread().getName() + " 我有笔，有本");
                    }
                }
            }
        }, "Thread-B").start();
    }

}
class Pen{

}
class Book{

}