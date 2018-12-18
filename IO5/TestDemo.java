public class TestDemo {
	public static void main(String[] args) throws IOException {
		File[] files = new File[] { new File("/Users/yuisama/Desktop/data-a.txt"),
		new File("/Users/yuisama/Desktop/data-b.txt") };
		String[] data = new String[2] ;
		for (int i = 0; i < files.length ; i++) {
			data[i] = readFile(files[i]) ;
		}
		StringBuffer buf = new StringBuffer() ; // 组合操作
		String contentA [] = data[0].split(" ") ;
		String contentB [] = data[1].split(" ") ;
		for (int i = 0; i < contentA.length ; i++) {
			buf.append(contentA[i]).append("
			(").append(contentB[i]).append(")").append(" ") ;
		}
		System.out.println(buf);
	}
	public static String readFile(File file) throws IOException {
	if (file.exists()) {
	InputStream input = new FileInputStream(file);
	// 没有向上转型，因为稍后要使用到toByteArray()方法。
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	int temp = 0;
	byte[] data = new byte[10];
	while ((temp = input.read(data)) != -1) {
	// 将数据保存在bos中
		bos.write(data, 0, temp);
	}
	bos.close();
	input.close();
	// 将读取内容返回
	return new String(bos.toByteArray());
	}
	return null;
	}
}