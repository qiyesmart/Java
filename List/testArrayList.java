package List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Author:QiyeSmart
 * Created:2019/5/11
 */
/*
数组实现
 */
public class testArrayList {
    public static void code1(){
        List<String>  list=new ArrayList<>();
        list.add("aduo");
        list.add("aduo1");
        list.add("aduo2");
        list.add(0,"aduo1");
        list.add("aduo1");
        System.out.println(list);
        System.out.println("---------------------");
        System.out.println("List是否为空"+list.isEmpty());
        System.out.println("List的长度"+list.size());
        System.out.println("List是否包含aduo"+list.contains("aduo"));
        System.out.println("List移除aduo1"+list.remove("aduo"));
        System.out.println("List移除0"+list.remove(0));
        System.out.println(list);
        System.out.println("---------------------");
        //获取下标>0&&<index-1
        System.out.println("获取index=1"+list.get(0));
        System.out.println("获取index=1"+list.get(1));

    }
    public static void main(String[] args) {
        //开发中尽量不要使用Collection接口
        Collection<String> collection=new ArrayList<>();
        collection.add("aduo");
        collection.add("aduo1");
        collection.add("aduo2");
        //System.out.println(collection);
        Object[]   number=collection.toArray();
        for(Object n:number){
            System.out.println(n);
        }
        //toString  Object[]效果与  List toString一样
        System.out.println(Arrays.toString(number)) ;

    }
}
