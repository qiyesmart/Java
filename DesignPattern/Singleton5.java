package designpattern;

/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
//多例
public class Singleton5 {
    private static final Singleton5 Female=new Singleton5("男");
    private static final Singleton5 Male=new Singleton5("女");
    private  static String value;
    private Singleton5(String value){
        this.value=value;
    }
    public String getValue(){
       return value;
    }
    public static Singleton5 getInstance(int flag){
        switch (flag){
            case 1:
                return Male;
            case 0:
                return Female;
            default:
                return null;
        }
    }
}
