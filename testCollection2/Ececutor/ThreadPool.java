package Ececutor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Author:QiyeSmart
 * Created:2019/5/11
 */
public class ThreadPool {
    public static void main(String[] args) {
        //内部创建线程
        ExecutorService executorService = new ThreadPoolExecutor(
                5,
                8,
                1,
                TimeUnit.MINUTES,
                //自己指定线程创造方式
                new ArrayBlockingQueue<>(10),
                new ThreadFactory() {
                    private final AtomicInteger id = new AtomicInteger(0);

                    @Override
                    public Thread newThread(Runnable r) {
                        Thread thread = new Thread(r);
                        thread.setName("Thread-Execute-Task-" + id.getAndIncrement());
                        return thread;
                    }
                }

        );
        //无返回值
        /*for(int  i=0;i<10;i++){
            //创建任务线程
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+" "
                    +LocalDateTime.now());
                }
            });
        }*/
        //返回线程结束时间
        final List<Future<String>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> future = executorService.submit(() -> {
                //随机休眠
                 Thread.sleep(new Random().nextInt(3000));
                return Thread.currentThread().getName() + " " + LocalDateTime.now();
            });
            futureList.add(future);
        }

        for (Future<String> future : futureList) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdownNow();
        System.out.println("是否shutdown "+executorService.isShutdown());
        //判断线程是否完全关闭
        System.out.println("是否Terminaed "+executorService.isTerminated());
        //演示Terminaed
       /* while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("是否terminated:" + executorService.isTerminated());
        }*/
    }

}
