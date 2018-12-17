public class Message implements AutoCloseable {
    
    public void print() {
        System.out.println("Message的print方法");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("关闭Message");
    }
    
    
    public static void main(String[] args) {
        
//        Message message = new Message();
//        message.print();
        
        //try-resources 命令
        try (Message m = new Message()) {
            m.print();
        } catch (Exception e) {
            e.printStackTrace();
        }