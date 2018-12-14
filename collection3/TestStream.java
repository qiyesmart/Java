public class TestStream {
    
    public static void code1() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        
        //找出包含Java的元素的个数
        long count = list.stream().filter(s -> s.contains("Java")).count();
        System.out.println("包含Java的元素有：" + count);
        
        //thought works
        //Stream
        //过滤并且收集
        List<String> rs = list.stream().filter(s -> s.contains("Java"))
                .map((s) -> s.toLowerCase()) //可以采用方法引用
                .collect(Collectors.toList());
        System.out.println(rs);
        System.out.println(list);
    }
    
    public static void code2() {
        List<String> list = new ArrayList<>();
        list.add("1. Java");
        list.add("2. C");
        list.add("3. C++");
        list.add("4. Python");
        list.add("5. JavaScript");
        list.add("6. SQL");
        
        
        //分页
//        List<String> rs = list.stream().skip(2).limit(3)
//                .collect(Collectors.toList());
//        System.out.println(rs);

//        List<String> rs = list.stream().filter(s -> s.contains("Java"))
//                .skip(1)
//                .limit(3)
//                .collect(Collectors.toList());
//        System.out.println(rs);
        
        List<String> rs = list
                .stream()
                .skip(1)
                .limit(3)
                .filter(s -> s.contains("Java"))
                .collect(Collectors.toList());
        System.out.println(rs);
    }
    
    
    public static void code3() {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Iphone", 8999.99, 10));
        orderList.add(new Order("外星人笔记本", 12999.99, 5));
        orderList.add(new Order("MacBookPro", 18999.99, 5));
        orderList.add(new Order("Java从入门到放弃.txt", 9.99, 20000));
        orderList.add(new Order("中性笔", 1.99, 200000));

//        double totalPrice = 0.0D;
//        for (Order order : orderList) {
//            totalPrice += order.getPrice() * order.getAmount();
//        }
//        System.out.println("总价：" + totalPrice);
        
        Double totalPrice = orderList.stream()
                .map(o -> o.getAmount() * o.getPrice())
                .reduce((result, item) -> result + item)
                .get();
        System.out.println(totalPrice);
        
        
        Optional<String> optionalS = Optional.of("Hello");
        System.out.println(optionalS.get());
        optionalS = Optional.ofNullable(null);
        System.out.println(optionalS.orElse("null"));
        System.out.println(optionalS.orElseGet(() -> "当前您获取的对象为null"));
        
    }
    
    
    public static Optional<File[]> getFiles(File file) {
        return Optional.ofNullable(file.listFiles());
        /*
        
         Optional<File[]> optionalFiles = getFiles(Paths.get("D:").toFile());
        for (File item : optionalFiles.orElse(new File[]{})) {
            System.out.println(item.getAbsolutePath());
        }
        
         */
    }
    
    public static void code4() {
        //统计分析
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Iphone", 8999.99, 10));
        orderList.add(new Order("外星人笔记本", 12999.99, 5));
        orderList.add(new Order("MacBookPro", 18999.99, 5));
        orderList.add(new Order("Java从入门到放弃.txt", 9.99, 20000));
        orderList.add(new Order("中性笔", 1.99, 200000));
        
        
        DoubleSummaryStatistics summaryStatistics = orderList.stream()
                .mapToDouble(o -> o.getPrice() * o.getAmount())
                .summaryStatistics();
        
        System.out.println("订单数量：" + summaryStatistics.getCount());
        System.out.println("订单总价：" + summaryStatistics.getSum());
        System.out.println("平均价格" + summaryStatistics.getAverage());
        
        System.out.println("最大值：" + summaryStatistics.getMax());
        System.out.println("最小值：" + summaryStatistics.getMin());
        
    }
    
    public static void code5() {
        Stream.of("Java", "C++", "Python")
                .sorted()
                .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        
    
    }
    
}

class Order {
    private String title;
    private double price;
    private int amount;
    
    public Order(String title, double price, int amount) {
        this.title = title;
        this.price = price;
        this.amount = amount;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
}