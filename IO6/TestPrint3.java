public class TestPrint3 {
   //scanner方式输入
	public static void code1{
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("请输入数据：") ;
		if (scanner.hasNext()) { // 有输入内容,不判断空字符串
			System.out.println("输入内容为: "+scanner.next());
		}
	scanner.close() ;
	}
	//接收其它类型
	public static void code2 {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("请输入年龄：") ;
		if (scanner.hasNextInt()) { // 有输入内容,不判断空字符串
			int age = scanner.nextInt() ;
			System.out.println("输入内容为: "+ age );
		}else {
			System.out.println("输入的不是数字!");
		}
	scanner.close() ;
	}
	//利用正则表达式进行判断
	public static void code3 {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("请输入生日：") ;
		if (scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
			String birthday = scanner.next() ;
			System.out.println("输入的生日为:" + birthday);
		}else {
			System.out.println("输入的格式非法，不是生日");
		}
		scanner.close() ;
	}
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new FileInputStream(new
		File("/Users/yuisama/Desktop/test.txt"))) ;
		scan.useDelimiter("\n") ; // 自定义分隔符
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
	scan.close();
	}
}