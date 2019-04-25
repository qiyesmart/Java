package threadWay;

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
//synchronized实现卖票同步处理
public class testTick {
    public static void main(String[]  args){
        Runnable runnable=new MyTick();
        new Thread(runnable,"Thread-黄牛A").start();
        new Thread(runnable,"Thread-黄牛B").start();
        new Thread(runnable,"Thread-黄牛C").start();
    }
}
class MyTick implements  Runnable{
    private int tick=10;
    public void run(){
        while(this.tick>0){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //--this.tick;
            //this.tick-1;
            //this.tick=this.tick-1;
            //多线程现在共享Runnable
            synchronized (this) {
                if (this.tick > 0) {
                System.out.println(Thread.currentThread().getName()+"卖票剩余"+(--this.tick));
               }
            }
        }
    }
}