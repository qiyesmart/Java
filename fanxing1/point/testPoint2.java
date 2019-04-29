package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型类
public class testPoint2<T> {
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
        return "testPoint2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args){
        //JDK1.7泛型类实例化对象时构造方法调用这里<>不需要指定类型
        //编译时检查具体类型
        //使用泛型类的时候，指定泛型的具体类型
        testPoint2<Integer> intpoint=new testPoint2<>();
        intpoint.setX(1);
        intpoint.setY(2);
        System.out.println(intpoint);
    }
}
