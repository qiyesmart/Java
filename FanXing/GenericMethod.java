public class GenericMethod {


//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static float add(float a, float b) {
//        return a + b;
//    }
    
    //a + b  a b 数值类型
    public static <T> void add(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }


//    public static void  print(int[] data){
//
//    }
//
//    public  static void print(String[] data){
//
//    }
    
    public static <T> void print(T[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
            if (i < data.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
    
    
    public static <T> T get(T data) {
        System.out.println(data);
        return data;
    }
    
    public static void code1() {
        //        add(1, 2);
//        add("Hello", "World");

//        print(new String[]{"Hello", "world"});
//        print(new Integer[]{1, 2, 3});
        
        System.out.println(get("Hello world"));
        System.out.println(get(100));
        
        //Collection Framework 大量使用到泛型
    }
    
    
    public static void main(String[] args) {
    
    
    }
}