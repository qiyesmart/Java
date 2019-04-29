package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型类可以和泛型方法共存,两者独立
//泛型类和泛型方法参数类型的字母最好区分开
public class testPoint5<T,E> {
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
    public <S> void print(S s){
        System.out.println(s);
    }
    /*
    //泛型参数和返回值类型一样
    public <S> S print2(S s){
        System.out.println(s);
    }*/

    public static void main(String[] args) {
            testPoint5<Integer,String> point5=new testPoint5<>();
            point5.print("aduoduo");
    }
}



