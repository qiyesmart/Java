package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author:QiyeSmart
 * Created:2019/5/13
 */
/*
HashMap：
key不能重复
Value可以重复
key可以为null
value可以为null
 */
public class testMap {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"aduo");
        map1.put(2,"aduo2");
        map1.put(5,"aduo3");
        map1.put(3,"aduo4");
        map1.put(4,"aduo5");
        System.out.println(map1.size());
        System.out.println(map1.get(1));
        System.out.println(map1.get(3));
        //key,通过equals hashcpde
        System.out.println(map1.containsKey(4));
        //打印所有的key
        System.out.println(map1.keySet());
        //打印所有的value
        System.out.println(map1.values());
        //遍历map方式1
        for(Integer key: map1.keySet()){
            System.out.println(key+"="+map1.get(key));
        }
        System.out.println("----------------------------");
        //遍历map方式2
        for(String value: map1.values()){
            System.out.println(value);
        }
        //遍历map方式3
        Set<Map.Entry<Integer,String>> entries= map1.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
