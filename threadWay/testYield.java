

/**
 * Author:QiyeSmart
 * Created:2019/4/25
 */
//线程让步(yield()方法)
//Thread类的静态方法
    //让当前线程暂停执行
    //交出CPU（想要获得该CPU权限的线程就必须和当前线程优先级相同，交出CPU时间点不确定）
    //不释放对象锁，线程回到就绪
public class testYield {
   public static void main(String args[]){
       MyYieldThread mt= new MyYieldThread();
       new Thread(mt).start();
       new Thread(mt).start();
       new Thread(mt).start();
   }
}
class  MyYieldThread implements Runnable{
    public void  run(){
        for(int i=0;i<1000;i++)
        {
            //回到就绪不会产生中断异常
            Thread.yield();
            System.out.println("当前线程:" + Thread.currentThread().getName() + ",i=" + i);
        }
    }
}
