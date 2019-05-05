package lamada;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
@FunctionalInterface // 是一个函数式编程接口，只允许有一个方法
public interface IUtil3<P1,P2,R> {
    R compare(P1 p1,P2 p2);
}
