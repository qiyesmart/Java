public class Sheji{
public static void main(String[] args){
	//实例化一个计算机
	Computer computer=new Computer();
	//实例化一个U盘
	UDisk udisk=new UDisk();
	computer.plugin(udisk);
	//是例化一个键盘
	KeyBoard keyboard=new KeyBoard();
	computer.plugin(keyboard);
	}
 }
//usb标准
interface  Usb{
	//安装驱动
	void setup();
	//设备工作
	void work();
}
class Computer{
	public void plugin(Usb usb){
	usb.setup();
	usb.work();
	}
}
class UDisk implements Usb{
	public void setup(){
		System.out.println("安装U盘地驱动程序");
	}
	public void work(){
		System.out.println("U盘进行数据的传输");
	}
}
class KeyBoard implements Usb{
	public void setup(){
		System.out.println("安装键盘地驱动程序");
	}
	public void work(){
		System.out.println("键盘上敲代码");
	}
}