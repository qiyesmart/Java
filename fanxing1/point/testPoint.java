package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
//泛型简单使用
/*
1.希望编译时，及时发现类型不匹配的问题；
2.必须明确知道参数类型中的引用数据类的具体类型Object（类型）
3.向下转型，需要通过instanceof判断
 */
public class testPoint {
    //int有副作用，默认值为0
    //private Integer x;
    //private Integer y;
    private Object x;
    private Object y;

    /*public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }*/

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "testPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    /*
1.希望编译时，及时发现类型不匹配的问题；
2.必须明确知道参数类型中的引用数据类的具体类型Object（类型）
3.向下转型，需要通过instanceof判断
 */
    public static int[] getXY(testPoint point){
        Integer x=(Integer) point.getX();
        if(point.getY() instanceof Integer){
            Integer y=(Integer) point.getY();
            return new int[]{x,y};
        }else{
            throw new ClassCastException("Point Y type not be  Integer");
        }
    }

    public static void main(String[]  args){
        testPoint point=new testPoint();
        point.setX(1);//20->Integer(引用数据类型)->Object
        point.setY(2);
        System.out.println(point);

        testPoint strpoint=new testPoint();
        point.setX("aduo");//String->Obiect
        point.setY("aduo1");
        System.out.println(point);

        testPoint strpoint2=new testPoint();
        point.setX(1);//
        point.setY("aduo1");
        System.out.println(point);
        getXY(point);

    }
}
