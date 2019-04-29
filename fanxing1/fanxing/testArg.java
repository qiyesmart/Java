package fanxing;

import java.util.Arrays;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
/*
1.可变参数
1.1可变参数会自动包装成数组，使用当做数组使用时；
1.2方法有多个参数时，可变参数需要放到参数列表最后；
1.3方法的可变参数，最多只有一个；
1.4可变参数不传值时，包装成了一个空数组；
2.foreach：增强的循环

 */
public class testArg {
    //可变参数
    /*public static int add(int ...numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        return sum;
    }*/
    public static int add(int ...numbers) {
        int sum = 0;
        //for(数据类型 临时变量 : 数组(集合)){}
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static int add2(String msg,int ... data) {
        int result = 0 ;
        for (int i = 0; i < data.length; i++) {
            result += data[i] ;
        }
        return result ;
    }
    public static void main(String[]  args){
       // System.out.println(add(1,2,3,4));
       // System.out.println(add2("Hello",1,4,5,6));
        System.out.println(add());
    }
}
