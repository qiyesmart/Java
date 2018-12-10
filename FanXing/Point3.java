public class Point3<T1, T2> {
    
    private T1 x;
    private T2 y;
    
    public Point3(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }
    
    public T1 getX() {
        return x;
    }
    
    public T2 getY() {
        return y;
    }
    
    public static void main(String[] args) {
        //JDK1.7  new Point3<>()
        //JDK1.6- new Point3<Integer,String>()
        Point3<Integer, String> point = new Point3<>(10, "北纬20度");
        
        Integer x = point.getX();
        String y = point.getY();
        System.out.println("(" + x + ", " + y + ")");
        
    }
}