package designpattern;

/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
//静态内部类实现单例模式
public class Singleton3 {
    private Singleton3() {}

    private static class SingletonInstance {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
