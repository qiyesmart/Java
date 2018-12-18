public class TestMessage {
    
    //匿名内部类实例化对象的方式
    public static void code1() {
        Message message = new Message() {
            @Override
            public void print() {
                System.out.println("Message print");
            }
        };
        message.print();
    }
    
    public static void main(String[] args) {
        Message message = () -> {
            System.out.println("Message print1");
            System.out.println("Message print2");
        };
        message.print();
        
        Message2 message2 = (message1) -> {
            System.out.println(message1);
            System.out.println(message1 + "...");
        };
        message2.print("Hello world");
        
        Message3 message3 = (message1, sub) -> {
            System.out.println(message1 + sub);
        };
        message3.print("hello", ".java");
        
        //return 只有一条语句
        Message4 message4 = (message1, sub) -> {
            return message1 + sub;
        };
        System.out.println(message4.print("hello", " java "));
        
    }
}