package designpattern;

/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
//单例模式双重检查
public class Singleton2 {

        private static volatile Singleton2 singleton;

        private Singleton2() {}

        public static Singleton2 getInstance() {
            //双重检查
            if (singleton == null) {
                synchronized (Singleton2.class) {
                    if (singleton == null) {
                        singleton = new Singleton2();
                    }
                }
            }
            return singleton;
        }

}
