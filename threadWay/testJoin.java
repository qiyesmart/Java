package threadWay;

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
// join()方法
//Thread类的成员方法，通过线程对象调用
    //如果在一个线程A中调用另外一个线程B的join方法（指定时间），那么执行线程A将休眠，
// 直到线程B的run方法执行完毕后，线程A将继续执行，
public class testJoin {
    public  static  void main(String args[]){
        System.out.println("当前线程:" + Thread.currentThread().getName() + "main执行开始" );
      Runnable runnable=new MyJoinRunnable();
      Thread thread=new Thread(runnable,"Thread-A");
      thread.start();
      //希望Thread-A执行完成之后，继续执行main方法中的代码
        try {
            thread.join();
            //中断异常
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程:" + Thread.currentThread().getName() + "main执行完成" );
    }
}
class   MyJoinRunnable implements   Runnable{
    public void run(){
        System.out.println("当前线程:" + Thread.currentThread().getName() + "执行开始" );
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
                //中断异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("当前线程:" + Thread.currentThread().getName() + "执行完成" );
    }
}