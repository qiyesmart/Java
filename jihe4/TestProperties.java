public class TestProperties {
    
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {

//            properties.load(new FileInputStream("E:\\worskpace\\java5_code\\javase1212\\src\\com\\bittech\\jcf\\hello-1.properties"));
            
            //资源文件加载：采用getResourceAsStream()
            properties.load(TestProperties.class.getResourceAsStream("hello.properties"));
            
            properties.list(System.out);
            System.out.println(properties.get("java"));
//            System.out.println(properties.getProperty("c", "C语言"));

//            properties.setProperty("java", "java is best");
//
//            properties.store(new FileWriter("D:\\hello.properties"), "这个是注释");
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}