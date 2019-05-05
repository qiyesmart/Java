package teXing;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
/*
1.枚举类型不能被用户实例化对象
2.定义枚举对象（通常名字是大写）
3.使用枚举对象通过枚举类.
4.枚举类型是典型的多例设计，每个枚举对象有且只有一个
5.列举所有的枚举对象，枚举类。values（）；
6.枚举对象的名称，枚举对象.name（）；
7.通过枚举类的valueOf（）方法获取枚举对象（枚举常量），name必须要存在
8.枚举类和普通类有相似的地方，定义成员属性——静态属性和方法
9.枚举对象的ordinal()开发中避免使用，它的值基于枚举对象定义的顺序，非要使用可以自定义下标
10.枚举类默认继承自java.lang.Enum父类，单继承关系，不能在继承其他类
11.枚举类可以实现接口
 */
public enum Color implements  IColor{
    //private static final Color RED=new Color();
    //隐含实例化
    RED("1122",1),//0

    GREEN("2222",2),//1
    BKUE("3333",3);//2

    private String rgb;
    public static String a="hello";
    //自定义下标
    private int index;
    //枚举类的构造方法是私有的
    Color(String rgb,int index){
        this.rgb=rgb;
        this.index=index;
    }

    public String getRgb() {
        return rgb;
    }

    //尽量不要使用set方法
    public void setRgb(String rgb) {
        this.rgb = rgb;
    }
    public void print(){
        System.out.println(this+"颜色的RGB"+this.getRgb());
    }
    public String  getColorRGB(){
        return this.rgb;
    }
}
