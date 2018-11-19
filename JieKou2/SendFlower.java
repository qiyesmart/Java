public class 	SendFlower{
	public static void main(String[] args){
	Subiect subject = Method.getInstance();
	subject.sendFlower();
}
}
interface Subiect{
  public void sendFlower(); 
}
class RealSubject implements Subiect{
public void sendFlower() {
    System.out.println("3.送花给");
}
}
class ProSubject implements Subiect{
	private Subiect subject;
	public ProSubject(Subiect subject) {
		this.subject = subject;
	}
    public void personSay(){
	System.out.println("1.张三告诉快递员");
    }
	 public void buyFlower(){
	System.out.println("2.买一束花");
    }
    public void peopleReceive(){
    System.out.println("4.李四");
    }
    public void sendFlower(){
	this.personSay();
	this.buyFlower();
	this.subject.sendFlower();
	this.peopleReceive();
	}
}
 class Method{
	public static Subiect getInstance(){
	return new ProSubject(new RealSubject());
}
}
