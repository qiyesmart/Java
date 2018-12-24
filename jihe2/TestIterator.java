public class TestIterator {
    
    public static void main(String[] args) {
        //List
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        //for body中移除操作可能产生问题
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.remove(i));
//        }
        
//        for (int i = 0, size = list.size(); i < size; i++) {
//            System.out.println(list.remove(i));
//        }
        
        //ok
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.remove(i));
//            i--;
//        }
        
        //java.util.ConcurrentModificationException 并发修改异常
        //ArrayList线程不安全的 foreach中不能修改
//        for (String item : list) {
//            System.out.println(item + " : " + list.remove(item));
//        }
        
        
        //当遍历集合时，需要根据条件移除某些元素时可以采用迭代器的移除元素
        //Iterator<String> iterator = list.iterator();
        /*
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println("List Size = " + list.size());*/
        
        //当遍历集合，只是做消费处理，消费型函数接口
        //iterator.forEachRemaining(System.out::println);
        
        
        ListIterator<String> iterator = list.listIterator();

//        System.out.println("从前往后：");
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next());
//            if (iterator.hasNext()) {
//                System.out.print(" ->  ");
//            }
//        }
//        System.out.println();
//
//
//        System.out.println("从后往前：");
//        while (iterator.hasPrevious()) {
//            System.out.print(iterator.previous());
//            if (iterator.hasPrevious()) {
//                System.out.print(" ->  ");
//            }
//        }
//        System.out.println();
        
        
        //双向迭代器：
        // add  next 前后都可以使用
        // set  next 后使用
        while (iterator.hasNext()) {
            // iterator.add("X");
            System.out.print(iterator.next() + ",");
            iterator.set("X");
            // iterator.add("X");
        }
        System.out.println();
        for (String item : list) {
            System.out.print(item + ", ");
        }
        
    }
}