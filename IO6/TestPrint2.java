public class TestPrint2 {
    //BufferedReader实现
	public static void main(String[] args) throws Exception {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("请输入信息 :") ;
		// 默认的换行模式是BufferedReader的最大缺点
		String str = buf.readLine() ; // 默认使用回车换行
		System.out.println("输入信息为:" + str );
	}
}