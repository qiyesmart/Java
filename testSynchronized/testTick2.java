package testSyc;

/**
 * Author:QiyeSmart
 * Created:2019/4/28
 */
//对一个类的方法加synchronized
public class testTick2 {
    public static void main(String[] args){
        Runnable runnable=new MyTick2();
        new Thread(runnable,"Thread-黄牛A").start();
        new Thread(runnable,"Thread-黄牛B").start();
        new Thread(runnable,"Thread-黄牛C").start();

    }
}
class MyTick2 implements  Runnable{
    private int tick=10;
    public void run(){
        while(this.tick>0){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            this.sale();
        }
    }
    public synchronized void sale(){
        if(this.tick>0){
            System.out.println(Thread.currentThread().getName()+"买票，剩余"+(--this.tick));
        }
    }
    //静态方法属于类的
    //类 Class
    //Class对象

    //MyTick2.print
    //Class<MyTick2> class
    //MyTick2.class对象加锁
    public synchronized static void print(){

    }


}