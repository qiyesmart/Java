public class TestPrint2 {
	public static void main(String[] args) throws Exception {
		PrintWriter printUtil = new PrintWriter(new FileOutputStream(new
		File("/Users/yuisama/Desktop/test.txt"))) ;
		printUtil.print("姓名:") ;
		printUtil.println("yuisama") ;
		printUtil.print("年龄：") ;
		printUtil.println(27) ;
		printUtil.print("工资： ") ;
		printUtil.println(0.000000000000001) ;
		printUtil.close();
	}
}