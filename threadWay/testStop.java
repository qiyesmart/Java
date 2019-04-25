package threadWay;

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
//线程停止
/*
1.Stop方法：stop方法会立即停止线程，容易导致同步失败问题，数据不完整；
2.interrupt中断：
Thread对象的interrupt的方法；
interrupt() 方法只是改变中断状态而已，只是一个中断信号，它不会中断一个正在运行的线程。给受阻塞的线
程发出一个中断信号，这样受阻线程就得以退出阻塞的状态。
调用其修改线程的中断标识（true）
3.1   如果线程非阻塞，中断标识true；
3.2   如果线程是阻塞，先中断标识true,然后分析引起阻塞的原因是wait,sleep,join方法引起，中断标识false,抛出中断异常
    中断的意义：让开发者跟进线程的中断标识来决定如何退出程序


 */

public class testStop {

    public static void main(String args[]) {
        Runnable runnable = new MyRunnableStop();
        Thread thread = new Thread(runnable);
        thread.setName("Thread-Flag");
        thread.start();
        try {
            Thread.sleep(5000);
            //中断异常
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //设立标记位
        //((MyRunnableStop)runnable).setFlag(false);
        //Stop方法
        thread.interrupt();
        System.out.println("主方法结束");
    }
}

    class MyRunnableStop implements Runnable {
        private boolean flag = true;

        public void run() {
            int i = 0;
            while (flag) {
                try {
                    Thread.sleep(1000);
                    //判断当前线程是否中断
                    boolean bool = Thread.currentThread().isInterrupted();
                    if (bool) {
                        System.out.println("非阻塞状态下的线程状态：" + bool);
                        break;
                    }
                    //如果非中断的状态，自己来决定如何处理异常
                    System.out.println("当前线程:" + Thread.currentThread().getName() + ",i=" + i++);
                    //中断异常
                    //e为异常对象，由虚拟机创建
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    boolean bool = Thread.currentThread().isInterrupted();
                    System.out.println(bool);
                    return;
                }
            }

        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }
    }

