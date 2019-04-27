package ConsumerAndProducter;
import java.util.Queue;

/**
 * Author:QiyeSmart
 * Created:2019/4/27
 */
/*
消费者模型：
1.消费商品；
2.从容器中取出商品；
2.如果容器为空，通知生产者生产
*/


class MyConsumers  implements   Runnable{
    private final Queue<Goods> queue;

    public MyConsumers(Queue<Goods> queue) {
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
                //容器为空，
                if (this.queue.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + " 容器已空 通知生产");
                    this.queue.notifyAll();
                } else {
                    //否则继续消费
                    Goods goods = this.queue.poll();
                    if (goods != null) {
                        System.out.println(Thread.currentThread().getName() + "  消费商品  " + goods);
                    }
                }
            }
        }
    }
}