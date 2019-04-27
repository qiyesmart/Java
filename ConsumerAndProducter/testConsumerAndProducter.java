package ConsumerAndProducter;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Author:QiyeSmart
 * Created:2019/4/27
 */
public class testConsumerAndProducter {
    public static void main(String[] args){
        //容器
        final Queue<Goods> queue=new LinkedList<>();
        //生产者业务类
        final Runnable produce=new  MyProducter(queue);
        //消费者业务类
        final Runnable  customer=new MyConsumers(queue);
        //生产者线程
        for(int i=0;i<5;i++){
            new Thread(produce,"Thread-Produce-"+i).start();
        }
        //消费者线程
        for(int i=0;i<5;i++) {
            new Thread(customer,"Thread-Customer-"+i).start();
        }
    }
}
