class PrintUtil {
	private OutputStream out ;
	// 由外部传入要输出的目标终端
	public PrintUtil(OutputStream out) {
		this.out = out ;
	}		// 核心功能就一个
	public void print(String str) {
		try {
			this.out.write(str.getBytes());
		} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void println(String str) {
	this.print(str+"\n");
	}
	public void print(int data) {
	this.print(String.valueOf(data));
	}
	public void println(int data) {
	this.println(String.valueOf(data));
	}
	public void print(double data) {
	this.print(String.valueOf(data));
	}
	public void println(double data) {
	this.println(String.valueOf(data));
	}
}
public class TestPrint {
	public static void main(String[] args) throws Exception {
		PrintUtil printUtil = new PrintUtil(new FileOutputStream(new
		File("/Users/yuisama/Desktop/test.txt"))) ;
		printUtil.print("姓名:") ;
		printUtil.println("yuisama") ;
		printUtil.print("年龄：") ;
		printUtil.println(27) ;
		printUtil.print("工资： ") ;
		printUtil.println(0.000000000000001);
	}
}