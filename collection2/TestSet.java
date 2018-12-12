public class TestSet {
    
    public static void code1() {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("!!!");
        set.add("hello");//Set元素不能重复
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public static void code2() {
        Set<String> set = new HashSet<>();
        set.add(null);//可以存储null
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public static void code3() {
        Set<String> set = new TreeSet<>();
        set.add("A");
        set.add("G");
        set.add("C");
        set.add("D");
        set.add("B");
        set.add("F");
        set.add("E");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    
    public static void code4() {
        Set<Person2> set = new TreeSet<>();
        set.add(new Person2("Jack", 22));
        set.add(new Person2("Alice", 24));
        set.add(new Person2("Tom", 26));
        set.add(new Person2("Alex", 20));
        set.add(new Person2("Alex", 20));
//        Iterator<Person2> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Person2 person2 = iterator.next();
//            System.out.println(person2);
//        }
        
        for (Person2 person2 : set) {
            System.out.println(person2);
        }
    }
    
    
    public static void code5(){
        //结合lambda和函数接口，构造TreeSet对象
        //灵活
        Set<Person> set = new TreeSet<>((o1, o2) -> {
            if (o1.equals(o2)) {
                return 0;
            }
            //Integer.compareTo
            //o1.getAge() - o2.getAge();
            return -1 * o1.getAge().compareTo(o2.getAge());
        });
        set.add(new Person("Jack", 22));
        set.add(new Person("Alice", 24));
        set.add(new Person("Tom", 26));
        set.add(new Person("Alex", 20));
    
        for (Person person : set) {
            System.out.println(person);
        }
    }
    
    
    public static void main(String[] args) {
        
    
    }
}

class Person2 implements Comparable<Person2> {
    
    private String name;
    private Integer age;
    
    
    public Person2(String name, Integer age) {
        this.name = name;
        this.age = age;
        
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Person2 person2 = (Person2) o;
        
        if (!name.equals(person2.name)) return false;
        return age.equals(person2.age);
    }
    
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }
    
    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    @Override
    public int compareTo(Person2 o) {
        //age
        if (o == null) {
            return -1;
        }
        return this.getAge() - o.getAge();
    }
}