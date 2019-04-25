package threadWay;

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
//线程休眠(sleep方法)
//Thread类的静态方法
    //让当前线程暂缓一定的时间，当时间到了继续执行
    //交出CPU，不释放对象锁，线程回到来了阻塞
public class testSleep {
    public static void main(String[] args){

       Runnable mt = new MySleepThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
    //所有的代码是依次进入到run()方法中的。
    //真正进入到方法的对象可能是多个，也可能是一个。进入代码的顺序可能有差异，但是总体的执行是并发执行
}

class  MySleepThread implements  Runnable{
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
                //中断异常
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程:" + Thread.currentThread().getName() + ",i=" + i);
        }
    }
}
