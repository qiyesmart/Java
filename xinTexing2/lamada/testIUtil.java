package lamada;

/**
 * Author:QiyeSmart
 * Created:2019/5/5
 */
public class testIUtil {
    public static void main(String[] args){

        //引用静态方法
        /*IUtil<Integer,String> iutil=(p)->{
            return String.valueOf(p);
        }*/
        IUtil<Integer,String> iu1 = String :: valueOf ; //进行方法引用
        System.out.println(iu1.switchPara(1));
        //引用某个对象的方法
        String str="Hello";
        /*IUtil2<String>  iu2=()->{
            return str.toLowerCase();
        }*/;
        IUtil2<String>  iu2=str::toLowerCase;
        System.out.println(iu2.convert());
         //引用某个特定类的方法
        /*IUtil3<Integer,Integer,Integer> iu3=(p1,p2)->{
            return p1.compareTo(p2);
        }*/
        IUtil3<Integer,Integer,Integer> iu3=Integer::compareTo;
        System.out.println(iu3.compare(1,2));
        //引用构造方法
        /*IUtil4<String,Integer,Person> iu4=(p1,p2)->{
         //   return new Person(p1,p2);
          };*/
        IUtil4<String,Integer,Person> iu4=Person::new;
        Person person=iu4.createObject("aduo",11);
        System.out.println(person);

    }
}
