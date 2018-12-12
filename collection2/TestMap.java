public class TestMap {
    
    public static void code1() {
        //HashMap : key value 可以为null
        Map<Integer, String> map = new HashMap<>();
        
        //基本使用
        map.put(1, "Java");
        map.put(2, "C");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        map.put(null, "null");
        map.put(5, null);
        //map.put(5, "PHP");
        map.put(6, "Java");
        
        System.out.println(map.get(1)); //Java
        System.out.println(map.get(null));//"null"
        System.out.println(map.get(5));//null
        System.out.println(map.get(6));//exist
        
        //获取所有的key
        System.out.println("所有的key:");
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            System.out.print(k + ", ");
        }
        System.out.println();
        
        //获取所有value
        System.out.println("所有的value:");
        Collection<String> values = map.values();
        for (String v : values) {
            System.out.print(v + ", ");
        }
        System.out.println();
        
        //遍历Map
//        System.out.println("通过key遍历map");
//        for (Integer key : map.keySet()) {
//            System.out.println(key + "=" + map.get(key));
//        }

//        System.out.println("通过Entry遍历map");
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }
        
        /*
        HashMap: 线程不安全的类型
        //HashMap
        int i = 20;
        //循环遍历HashMap做修改会产生 ConcurrentModificationException
        for (Integer key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
            map.put(i++, String.valueOf(i));
        }
        */
        
    }
    
    public static void main(String[] args) {
        //HashMap : key value 可以为null
        Map<Integer, String> map = new HashMap<>();
        
        //基本使用
        map.put(1, "Java");
        map.put(2, "C");
        map.put(3, "C++");
        map.put(4, "JavaScript");
        
        //System.out.println(map.getOrDefault(4, "JavaScript 6"));
        //System.out.println(map.getOrDefault(5, "JavaScript 6"));
        
        /*
        System.out.println(map.putIfAbsent(4, "PHP"));
        System.out.println(map.putIfAbsent(5, "PHP"));
        System.out.println(map.putIfAbsent(5, "PHP5"));
        */
        
        /*
        System.out.println(map.remove(4));
        System.out.println(map.remove(5));
        */
        
        // System.out.println( map.replace(4,"JavaScript 6"));
        //System.out.println(map.replace(4, "JavaScript", "JavaScript 6"));
        //System.out.println(map.get(4));
        
        //修改密码： 用户名  原密码   新密码


//        map.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer k, String v) {
//                System.out.println(k + "=" + v);
//            }
//        });
        
        //lambda 方式遍历map
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }
    
}