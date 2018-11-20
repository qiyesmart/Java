public class BuyComputer{
	public void buy(Computer computer){
		computer.printComputer();
	}
	//简单工厂模式
	public static void code1(){
		BuyComputer client=new BuyComputer();
		//1.通过入口方法的参数决定实例化的对象
		/*if(args.length==0){
			System.out.println("需要传入参数，指定创建的计算机类型");
		}else{
			String type=args[0];
			Computer computer=ComputerFactory.getInstance(type);
			if(computer==null){
				System.out.println("需要传入参数，指定创建的计算机类型");
			}else{h
			client.buy(computer);
			}
		}*/
		//2.通过交互式用户输入的方式
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		while(true){
			System.out.println("需要传入参数，指定创建的计算机类型,输入q退出程序");
		String value=scanner.nextLine();
		if(value.equals("q")){
			break;
		}
		Computer computer=ComputerFactory.getInstance(value);
			if(computer==null){
				System.out.println("需要传入参数，指定创建的计算机类型");
			}else{
			client.buy(computer);
			}
		}
	}
	//工厂模式
	public static void code2(){
		BuyComputer client=new BuyComputer();
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		while(true){
			System.out.println("需要传入参数，指定创建的计算机类型,输入q退出程序");
		String value=scanner.nextLine();
		if(value.equals("q")){
			break;
		}
		ComputerFactory1 computerfactory=null;
		switch(value){
			case "mac":
			computerfactory=new MacBookComputerFactory();
			break;
			case "leishe":
			computerfactory=new LeiSheComputerFactory();
			break;
			default:
			System.out.println("暂时没有此类笔记本工厂");
		}
		Computer computer=ComputerFactory.getInstance(value);
			if(computerfactory==null){
				System.out.println("需要传入参数，指定创建的计算机类型");
			}else{
				Computer computer1=computerfactory.createComputer();
			client.buy(computer1);
			}
		}
	}
	//抽象工厂模式
	public static void buy(Production production){
		production.printInfo();
	}
	public static void main(String[] args){
		BuyComputer client=new BuyComputer();
		//ProductionFactory factory=new AppleFactory();
		//Production production=factory;
		//production.printInfo();
		client.buy(new AppleFactory());
	}	
}
interface Production{
	void printInfo();
}
interface Computer{
	void printComputer();
}
interface OperatorSystem{
	void printSystem();
}
//计算机实例化对象工厂（简单工厂模式）
class ComputerFactory{
	public static Computer getInstance(String type){
		Computer computer=null;
		if(type==null){
			return computer;
		}
		switch(type){
			case "mac":
			computer=new MacBookComputer();
			break;
			case "leishe":
			computer=new LeiSheComputer();
			break;
			case "alienware":
			computer=new AlienwareComputer();
			break;
			default:
			System.out.println("暂时没有此类笔记本");
		}
		return computer;
	}
}
//工厂方法模式
interface ComputerFactory1{
	Computer createComputer();
}
//抽象工厂模式
interface  ProductionFactory extends Production{
	Computer createComputer();
	OperatorSystem createSystem();
}
class MacBookComputer implements Computer{
	public void printComputer(){
		System.out.println("这是一台MacBook计算机");
	}
}
class MacOs implements OperatorSystem{
	public void printSystem(){
		System.out.println("这是MacOs操作系统");
	}
}
class MacBookComputerFactory implements ComputerFactory1{
	public Computer createComputer(){
		return new MacBookComputer();
	}
}
//apple的工厂
class AppleFactory implements ProductionFactory{
	public Computer createComputer(){
		return new MacBookComputer();
	}
	public OperatorSystem createSystem(){
		return new MacOs();
	}
	public void printInfo(){
		this.createComputer().printComputer();
		this.createSystem().printSystem();
	}
}
class LeiSheComputer implements Computer{
	public void printComputer(){
		System.out.println("这是一台LeiShe计算机");
	}
}
class Windows implements OperatorSystem{
	public void printSystem(){
		System.out.println("这是Windows操作系统");
	}
}
class LeiSheComputerFactory implements ComputerFactory1{
	public Computer createComputer(){
		return new LeiSheComputer();
	}
}
//MS的工厂
class MSFactory implements ProductionFactory{
	public Computer createComputer(){
		return new LeiSheComputer();
	}
	public OperatorSystem createSystem(){
		return new Windows();
	}
	public void printInfo(){
		this.createComputer().printComputer();
		this.createSystem().printSystem();
	}
}
class AlienwareComputer implements Computer{
	public void printComputer(){
		System.out.println("这是一台Alienware计算机");
	}
}