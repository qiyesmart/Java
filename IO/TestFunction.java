public class TestFunction {
    
    // 输入->输出 功能型函数
    public static void code1() {
        Function<Object, String> f1 = String::valueOf;
        System.out.println(f1.apply(1));
        
        Function<Object, String> f2 = (o) -> {
            return o.toString();
        };
        System.out.println(f2.apply("Hello"));
        
        IntFunction<String> f3 = String::valueOf;
        System.out.println(f3.apply(3));
    }
    
    //供给型函数
    public static void code2() {
        Supplier<String> s1 = "Hello"::toString;
        System.out.println(s1.get());//"Hello";
        s1 = "Hello"::toUpperCase;
        System.out.println(s1.get());//"HELLO"
        
        
        Supplier<Integer> s2 = () -> {
            return new Random().nextInt();
        };
        System.out.println(s2.get());
        System.out.println(s2.get());
        
        //函数编程，lambda
        //函数的组合使用
        //y=f(x)  x=g(a) =>  y = f(g(a));
        Function<Supplier<String>, String> function = (a1) -> {
            return a1.get().toUpperCase();
        };
        Supplier<String> supplier = () -> {
            return "hello";
        };
        String rs = function.apply(supplier);
        System.out.println(rs);
    }
    
    //消费型函数接口
    public static void code3() {
        //遍历，打印
        //引用方法（对象的方法）
        Consumer<String> c1 = System.out::println;
        c1.accept("Hello");
        c1.accept("Java is best");
        
        //通过lambda实现的
        Consumer<Person> c2 = (p) -> {
            System.out.println(p.toString());
        };
        c2.accept(new Person("jack", 22));
        
    }
    
    //断言型函数
    public static void code4() {
        Predicate<String> p1 = "Hello"::startsWith;
        System.out.println(p1.test("H"));
        
        Predicate<Object> p2 = (o) -> {
            return o instanceof Person;
        };
        
        System.out.println(p2.test(new String()));//false
        System.out.println(p2.test(new Person("Jack", 22)));//true
        
        //现代编程 （最大限度使用CPU,内存）-> 硬件
        //并发编程（多线程），并行计算
    }
    