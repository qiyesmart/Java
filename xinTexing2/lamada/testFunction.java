package lamada;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
public class testFunction {
    //JDK内部提供的函数
    //方法引用本质：1.面向对象中的方法提供了别名2.面向对象和面向函数的桥梁
    public static void main(String[]  args){
        //功能型函数使用
        Function<Integer,String> function=String::valueOf;
        Function<String,Boolean> function1=Boolean::parseBoolean;
        System.out.println(function.apply(1));
        System.out.println(function1.apply("false"));
        //供给型函数接口使用
        Supplier<String> supplier="hello"::toUpperCase;
        Supplier<Person> supplier1=()->{
            return new Person("aduo",12);
        };
        System.out.println(supplier.get());
        System.out.println(supplier1.get());
        //消费型函数接口
        Consumer<Integer[]> consumer=(arrary)->{
            for(int i=0;i<arrary.length;i++){
                System.out.println(arrary[i]);
            }
        };
        consumer.accept(new Integer[]{1,2,3});
        //断言型函数接口
        Predicate<Person>  predicate=(p)->{
            return p!=null;
        };
        System.out.println(predicate.test(null));
    }
}
