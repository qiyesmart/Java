/**
 * Author:QiyeSmart
 * Created:2019/4/24
 */
/*
线程的创建：


线程的创建：

1.
1.1 自定义类继承java.lang.Thread类，覆写run方法
1.2 实例化自定义类对象，该对象就是一个具备线程执行的对象
1.3 线程类的对象run方法直接调用和普通类的对象调用没有区别
   1.3.1直接调用run方法，实际还是同步执行，跟线程没关系
   1.3.2 调用start方法，才会异步执行，跟线程有关系，该方法不能多次调用
1.4 native修饰的方法称为本地方法，需要依赖平台实现 JNI(Java Native Interface)

2.Runnable类实现（业务无返回结果）
2.1 自定义类实现java.lang.Runnable接口，实现run方法
2.2 实例化Thread类对象，通过构造方法传入Runnable接口的实现类的实例化对象或者一个Lambda表达式
2.3 线程的启动方式start

3.Callable类实现（业务有返回结果）：
3.1 自定义类实现java.util.concurrent.Callable接口，实现call方法
3.2 FutureTask 包装 Callable接口实现类的对象
3.3 实例化Thread类对象，通过构造方法传入FutureTask对象
3.4 通过Thread对象的start方法启动线程
3.5 通过FutureTask对象的get方法获取结果（阻塞方法）

继承Thread vs 实现Runnable/Callable
继承Thread:
+ 单继承缺陷
+ 业务逻辑和线程逻辑耦合
实现Runnable
+ 解决Thread的继承缺陷，实现多接口
+ 业务逻辑和线程逻辑无关
+ 创建Thread对象，传入业务对象
+ 业务逻辑能够复用


4. 线程方法
4.1 线程名称
4.1.1线程创建建议设置一个简明思议的名称（表示线程的功能）
4.1.2 获取当前线程Thread.currentThread()
4.2.3 获取线程名称thread.getName()
4.2.4 线程名称：普通线程名称  thread-index , 主线程名称：main
4.2.5主方法本身就是一个线程，所有的用户线程都是通过主线程创建并启动的，用户线程中也可以创建其它线程。
4.2.5Java程序启动，创建JVM进程，创建main线程，JVM进程中至少有一个线程（实际上JVM启动之后除了main线程外，还有其它线程，比如垃圾回收线程）
4.2.6 Java中线程是最小的执行单元，JVM进程线程不存在了，JVM进程退出

*/

