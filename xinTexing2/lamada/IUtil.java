package lamada;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
//函数泛型接口
@FunctionalInterface // 是一个函数式编程接口，只允许有一个方法
public interface IUtil<P,R> {
    public R switchPara(P p);
}
