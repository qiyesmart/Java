//基本使用
class Point <T> { // T表示参数，是一个占位的标记；如果有多个泛型就继续在后面追加
	private T x ;
	private T y ;
	public T getX() {
			return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}
public class TestDemo {
	public static void main(String[] args) {
	// 设置数据
	Point<String> p = new Point<String>() ; 
	p.setX("东经80度");
	p.setY("北纬20度");
	// 取出数据
	String x = p.getX() ; // 避免了向下转型
	String y = p.getY() ;
	System.out.println("x = " +x+",y = "+y);
	}
}