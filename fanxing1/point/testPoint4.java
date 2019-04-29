package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型方法
public class testPoint4 {
    public <T> void print(T t){
        System.out.println(t);
    }
    public <T,X> void print2(T t,X x){
        System.out.println(t);
        System.out.println(x);
    }
    public static void main(String[] args){
       new  testPoint4().print("hello");
        new  testPoint4().print2("hello",3);
    }
}
