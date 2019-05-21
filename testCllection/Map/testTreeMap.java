package Map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Author:QiyeSmart
 * Created:2019/5/21
 */

public class testTreeMap {
    public static void main(String[] args) {
        //自己实现一个比较器
        TreeMap<Integer,String>  treeMap=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        //Integer内部实现了Comparable接口
        treeMap.put(1,"aduo1");
        treeMap.put(2,"aduo2");
        treeMap.put(3,"aduo3");
        treeMap.put(5,"aduo5");
        treeMap.put(4,"aduo4");
        System.out.println(treeMap);
    }
}
