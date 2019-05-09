package Singleton;

import java.sql.SQLOutput;

/**
 * Author:QiyeSmart
 * Created:2019/5/9
 */
//多例设计模式
public class testSex {
    public static void main(String[] args) {
        Sex male=Sex.getInstance("male");
        Sex female=Sex.getInstance("female");
        System.out.println(male==female);
        System.out.println(male);
        System.out.println(female);
    }
}
class Sex{
    private String name;
    private static Sex male=new Sex("男人");
    private static Sex female=new Sex("女人");
    public Sex(String name) {
        this.name = name;
    }
    public static Sex getInstance(String name){
        if(name.equals("male")){
            return male;
        }else if(name.equals("female")){
            return female;
        }else{
            return null;
        }
    }

    @Override
    public String toString() {
        return "Sex{" +
                "name='" + name + '\'' +
                '}';
    }
}
