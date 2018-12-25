public class TestDemo {
  public static void main(String[] args) throws IOException {
    List<String> list = new ArrayList<>() ;
    // 相当于调用了三次add()方法
    Collections.addAll(list,"A","B","C") ;
    System.out.println(list) ;
    // 集合反转
    Collections.reverse(list) ;
    System.out.println(list) ;
 }
}