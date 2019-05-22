package Map;

import java.util.HashMap;
import java.util.Iterator;
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
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "aduo");
        map1.put(2, "aduo2");
        map1.put(5, "aduo3");
        map1.put(3, "aduo4");
        map1.put(4, "aduo5");
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
        for (Integer key : map1.keySet()) {
            System.out.println(key + "=" + map1.get(key));
        }
        System.out.println("----------------------------");
        //遍历map方式2
        for (String value : map1.values()) {
            System.out.println(value);
        }
        //遍历map方式3
        //Entry是一在Map类里面定义的静态接口，Map.Entry<k，v>相当于Node<k
        // ,v>，提供getKey()，getValue()两种方式
        //map1.entrySet()提供了一个set集合,里面存放的是hasmap的每个结点
        //将map转为set接口，然后通过for each遍历
       /* Set<Map.Entry<Integer,String>> entries= map1.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/
        System.out.println("---------------------------------------");
        //间接使用iterator
        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
