package Ececutor;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Author:QiyeSmart
 * Created:2019/5/11
 */
public class testExecutor {
    public static void main(String[] args) {
       //ExecutorService executorService=Executors.newFixedThreadPool(5);
        //任务按顺序执行
       // ExecutorService executorService=Executors.newSingleThreadExecutor();

       // ExecutorService executorService=Executors.newCachedThreadPool();
       /* for (int i = 0; true; i++) {
            executorService.execute(new Runnable() {
                @Override
               public void run() {
                   System.out.println(Thread.currentThread().getName() + " " + LocalDateTime.now());
                }
            });
        }*/
       //测试ScheduledThreadPool
      ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        executorService.schedule(() -> {
            System.out.println(Thread.currentThread().getName() + "   延迟执行一次  " + LocalDateTime.now());
        }, 15, TimeUnit.MINUTES.SECONDS);

        executorService.scheduleAtFixedRate(() -> {
            System.out.println(Thread.currentThread().getName() + " 固定时间间隔 " + LocalDateTime.now());
        }, 0, 10, TimeUnit.SECONDS);

        executorService.scheduleWithFixedDelay(() -> {
            System.out.println(Thread.currentThread().getName() + " 固定延迟时间 " + LocalDateTime.now());
        }, 0, 20, TimeUnit.SECONDS);
    }
}
