public class Point {
    
    private Object x;
    
    private Object y;
    
    public Point(Object x, Object y) {
        this.x = x;
        this.y = y;
    }
    
    public Object getX() {
        return x;
    }
    
    public Object getY() {
        return y;
    }
    
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    
    
    public static void main(String[] args) {
        //整数类型
        Point point1 = new Point(10, 20);
        int x1 = (int) point1.getX();
        int y1 = (int) point1.getY();
        System.out.println("(" + x1 + ", " + y1 + ")");
        
        //double类型
        Point point2 = new Point(10.1, 20.1);
        double x2 = (double) point2.getX();
        double y2 = (double) point2.getY();
        System.out.println("(" + x2 + ", " + y2 + ")");
        
        //字符串类型
        Point point3 = new Point("东经40度", "北纬20度");
        String x3 = (String) point3.getX();
        String y3 = (String) point3.getY();
        System.out.println("(" + x3 + ", " + y3 + ")");
        
        Point  point4 = new Point(40,"北纬20度");
        int x4 = (int)point4.getX();
        String y4 =(String)point4.getY();
        System.out.println("(" + x4 + ", " + y4 + ")");
        
    }
}