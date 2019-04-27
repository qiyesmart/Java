package ConsumerAndProducter;

import java.util.Queue;
 import java.util.concurrent.atomic.AtomicInteger;
/*
 * Author:QiyeSmart
 * Created:2019/4/27
 */
/*
生产者模型：
1.生产商品；
2.将生产的商品添加到容器；
3.如果容器已经满了，等待消费；
 */
class MyProducter  implements  Runnable{
    private final Queue<Goods> queue;
     //容器最大容量
    private final Integer maxCapacity = 10;

    //商品id编号
    private final AtomicInteger id = new AtomicInteger(0);

    public MyProducter(Queue<Goods> queue) {
        this.queue = queue;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(this.queue) {
                //容器已满则等待
                if (this.queue.size() == maxCapacity) {
                    //wait
                    System.out.println(Thread.currentThread().getName() + " 容器满了  等待消费");
                    try {
                        this.queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    //容器未满则继续生产
                    Goods goods = new Goods(
                            String.valueOf(id.getAndIncrement()),
                            "商品"
                    );
                    System.out.println(Thread.currentThread().getName() + " 生产商品 " + goods);
                    this.queue.add(goods);
                }
            }
        }
    }

}