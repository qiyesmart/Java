package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型上限用到类
//泛型下限不能用到类，只能用到泛型方法
public class testPoint6<T extends CharSequence> {
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "testPoint6{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
