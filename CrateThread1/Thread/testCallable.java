package Thread;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/**
 * Author:QiyeSmart
 * Created:2019/4/24
 */
public class testCallable {
    public static void main(String[] args) {
        Callable<String>   callable=new MyCallable();
        //将来的任务
        //FutureTask 包装 Callable接口实现类的对象
        FutureTask<String> futureTask=new FutureTask<>(callable);

        Thread  thread=new Thread(futureTask);
        thread.start();
        System.out.println("main 代码");
        System.out.println("main 代码");
        System.out.println("main 代码");

        try {
            //阻塞方法 获取线程执行的结果
            String string = futureTask.get();
            System.out.println(string);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }
}
class MyCallable implements Callable<String> {
    private int tick = 10;

    @Override
    public String call() throws Exception {
        while (this.tick > 0) {
            System.out.println("剩余：" + --this.tick + " 票");
        }
        return "票卖完啦";
    }
}