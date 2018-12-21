public class TestList {
    
    public static void code1() {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        list1.add("!!!!");
        list1.add("Hello");

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }

//        for (String aList1 : list1) {
//            System.out.println(aList1);
//        }

//        Iterator<String> iterator = list1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        
        System.out.println(list1.contains("hello")); //false
        System.out.println(list1.contains("Hello")); //true
        System.out.println(list1.get(0)); //Hello
        System.out.println(list1.indexOf("hello"));//-1
        System.out.println(list1.size());//4
        System.out.println(list1.lastIndexOf("hello"));//-1
        System.out.println(list1.remove(1));//World
        System.out.println(list1.size()); //3
        System.out.println(list1.remove("hello"));//false
    }
    
    //Collection.toArray() 使用泛型方法
    public static void code2() {
        Collection<String> collection = new ArrayList<>();
        
        collection.add("hello");
        collection.add("world");
        collection.add("!!!");

//        Object[] datas = collection.toArray();
//        for (Object item : datas) {
//            //向下转型
//            System.out.println(item);
//        }
        
        String[] strs = new String[collection.size()];
        collection.toArray(strs);
        for (String item : strs) {
            System.out.println(item);
        }
    }
    
    
    public static void code3() {
        Collection<String> collection = new ArrayList<>();
        
        collection.add("hello");
        collection.add("world");
        collection.add("!!!");
        
        Object[] datas = collection.toArray();
        //[e1,e2,e3, ... ]
        //[]
        //"null"
        System.out.println(Arrays.toString(datas));
    }
    
    
    public static void code4() {
        List<Person> people = new ArrayList<>();
        Person jack = new Person("Jack", 22);
        people.add(jack);
        people.add(0, new Person("Tom", 23));
        people.add(new Person("Alice", 18));
        
        System.out.println("当前人员：");
        for (Person person : people) {
            System.out.println(person);
        }
        
        
        System.out.println("移除后人员：");
        for (Person person : people) {
            System.out.println(person);
        }

//        System.out.println(people.contains(new Person("Jack", 22))); // 也不包含
        //System.out.println(people.contains(jack));
        
        System.out.println(people.contains(new Person("Jack", 22)));
    }
    
    public static void code5() {
        //List 功能，标准，远程方法调用
        List<String> vector = new Vector<>();
        vector.add("hello");
        // ((Vector<String>) vector).addElement("");
        vector.add(0, "world");
        for (String item : vector) {
            System.out.println(item);
        }
        //Enumeration JDK1.0
        //Iterator    JDK1.2
        Enumeration<String> enumeration = ((Vector<String>) vector).elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
    
    
    public static void main(String[] args) {
        
        //ArrayList   []固定，扩容
        //LinkedList 链表
        List<Person> people = new LinkedList<>();
        
        people.add(new Person("Jack", 22));
        //默认往后加
        people.add(new Person("Tom", 23));
        
        ((LinkedList<Person>) people).addFirst(new Person("Alice", 18));
        ((LinkedList<Person>) people).addLast(new Person("Alex", 19));
        
        for (Person p : people) {
            System.out.println(p);
        }
        
    }
}

//Object equals hashCode =>
class Person {
    
    private String name;
    private Integer age;
    
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }

//    public boolean equals(Object obj) {
//        if (super.equals(obj)) {
//            return true;
//        } else {
//            if (obj == null) {
//                return false;
//            }
//            if (obj instanceof Person) {
//                Person that = (Person) obj;
//                return this.getName().equals(that.getName())
//                        &&
//                        this.getAge().equals(that.getAge());
//            } else {
//                return false;
//            }
//        }
//    }


//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(name, person.name) &&
//                Objects.equals(age, person.age);
//    }
//
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
    
    
    //高效Java编程 -> Effective Java
    //equals hashCode覆写的时候一起出现
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Person person = (Person) o;
        
        if (!name.equals(person.name)) return false;
        return age.equals(person.age);
    }
    
    public int hashCode() {
        //hash碰撞
        //2 << 5 -1
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }
    public String toString() {
        return String.format("姓名：%s, 年龄：%d", this.getName(), this.getAge());// format , 可变参数
    }
}