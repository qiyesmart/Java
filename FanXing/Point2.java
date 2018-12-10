public class Point2<T> {
    
    private T x;
    private T y;
    
    public Point2(T x, T y) {
        this.x = x;
        this.y = y;
    }
    
    public T getX() {
        return x;
    }
    
    public T getY() {
        return y;
    }
    
    
    public static void main(String[] args) {
//        Point2<Integer> point = new Point2<>(10, 20);
//        int x = point.getX();
//        int y = point.getY();
//        System.out.println("(" + x + ", " + y + ")");
        
        
        Point2<String> point = new Point2<>("东经40度","北纬20度");
        String x = point.getX();
        String y = point.getY();
        System.out.println("(" + x + ", " + y + ")");
        
        
    }
    
}