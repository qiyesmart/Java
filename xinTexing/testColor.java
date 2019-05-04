package teXing;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
public class testColor {
    public static void main(String[] args){
       /* //获取枚举内所有对象的名称
        Color[] colors=Color.values();
        for(Color c:colors){
            System.out.println(c.name());
        }
        //获取单个对象的名字
        System.out.println(Color.valueOf("YELLOW"));
        */
       /*
       Color.GREEN.print();
       //活的成员对象原有下标
       System.out.println(Color.GREEN.ordinal());
       */
       //枚举实现接口测试
       IColor color=Color.RED;
       System.out.println(color.getColorRGB());
    }
}
