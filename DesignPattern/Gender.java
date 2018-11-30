package designpattern;



/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
//interface==class==enum；
//1.枚举类型不能实例化；
    //2.不要给枚举类型提供公开的构造方法；
    //3.先写实例化对象
    //4.枚举类型也是可以添加成员方法和属性

    //通过枚举实现多例
public enum Gender {
    FEMALE("男"),MALE("女");
    private String type;
    Gender(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
