package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型类可以传入多个构造参数
public class testPoint3<T,E> {
    private T x;
    private E y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "testPoint3{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public static void main(String[] args){
        testPoint3<Integer,Integer> intpoint1=new testPoint3<>();
        intpoint1.setX(1);
        intpoint1.setY(2);
        System.out.println(intpoint1);

        testPoint3<Integer,String> intpoint2=new testPoint3<>();
        intpoint2.setX(1);
        intpoint2.setY("aduo");
        System.out.println(intpoint2);
    }

}
