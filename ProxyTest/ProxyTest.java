public class ProxyTest{
	public  static void main(String[] args){
		RealSubject realSubject=new RealSubject();
		ProxySubject proxySubject=new ProxySubject(realSubject);
		proxySubject.buyComputer();
	}
	
}
//代理模式
interface Subject{
	void buyComputer();
}
//真正业务
class RealSubject implements Subject{
	public void buyComputer(){
		System.out.println("购买一台雷蛇笔记本");
	}
}
//代理业务-辅助业务
class ProxySubject implements Subject{
	private final Subject target;
	public ProxySubject(Subject target){
		this.target=target;
	}
	public void buyComputer(){
		System.out.println("生产一台雷蛇笔记本");//真实操作前的准备
		this.target.buyComputer();//调用真正业务
		System.out.println("雷蛇笔记吧的售后服务为您服务");//售后
	}
}