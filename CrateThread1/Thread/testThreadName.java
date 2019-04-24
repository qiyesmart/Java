package Thread;

/**
 * Author:QiyeSmart
 * Created:2019/4/24
 */
public class testThreadName {
    public static void main(String[] args){
        //创建新对象的时候就赋予名字
       // for (int i = 0; i < 5; i++) {
        //    new MyThreadName("MyThread-" + i).start();//启动线程
       // }
        //使用setName函数赋名
      // Thread thread = new MyThreadName("Thread-Print");
       //thread.setName("Thread-Print");
        //thread。start()
    }
}
class MyThreadName  extends Thread{
    public MyThreadName(String name){
        super(name);
        }
        public void run(){
        for(int i=0;i<10;i++){
            //获取当前进程
        Thread thread=Thread.currentThread();
        //获取当前进程名称
        String name=thread.getName();
        System.out.println(name+" "+i);
        }
        }
}