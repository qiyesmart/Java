public class TestPrint {
		//系统输入
		public static void code1 {
		InputStream in = System.in ;
		byte[] data = new byte[1024] ;
		System.out.print("请输入信息:");
		int temp = in.read(data) ; // 数据读取到字节数组中
		System.out.println("输出内容为 :" +new String(data,0,temp)) ;
	}
	public static void main(String[] args) throws Exception {
		InputStream in = System.in ;
		ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
		byte[] data = new byte[10] ;
		System.out.print("请输入信息:");
		int temp = 0 ;
		while((temp = in.read(data)) != -1) {
		bos.write(data,0,temp) ; // 保存数据到内存输出流中
		// 这里面需要用户判断是否输入结束
		if (temp < data.length) {
			break ;
		}
		}
		in.close() ;
		bos.close() ;
		System.out.println("输出内容为 :" +new String(bos.toByteArray())) ;
	}
}