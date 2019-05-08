package testString;

/**
 * Author:QiyeSmart
 * Created:2019/5/8
 */
/*
  包装类拆装箱
 */
public class testInteger {
    public static void main(String[] args) {

        //装箱子
        Integer interger=new Integer(1);
        //拆箱
        int a=interger.intValue();
        System.out.println(a);
        //自动装箱
        Integer integer2=10;
        //自动拆箱
        System.out.println(integer2+10);

    }
}
