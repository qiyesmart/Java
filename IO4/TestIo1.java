public class TestIo1 {
    
    //输入流 -> 输出流
    public static void code1() {
        File srcFile = new File("D:" + File.separator + "a" + File.separator + "src.txt");
        File destFile = new File("D:" + File.separator + "a" + File.separator + "dest.txt");
        InputStream ins = null;
        OutputStream ous = null;
        try {
            ins = new FileInputStream(srcFile);
            ous = new FileOutputStream(destFile);
            int len = -1;
            byte[] buffer = new byte[3];
            while ((len = ins.read(buffer)) != -1) {
                //len 正真读取的内容长度
                ous.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ins != null) {
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //文件输出追加
    public static void code2() {
        File file = Paths.get("D:", "a", "abc.txt")
                .toFile();
        OutputStream ous = null;
        try {
            ous = new FileOutputStream(file, true);
            String content = "Java5 班";
            //输出一部分内容
//            ous.write(content.getBytes(),0,2);
            //输出完整内容
            ous.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    //采用自动关闭流（输入，输出）
    public static void code3() {
        File srcFile = new File("D:" + File.separator + "a" + File.separator + "src.txt");
        File destFile = new File("D:" + File.separator + "a" + File.separator + "dest.txt");
        try (InputStream ins = new FileInputStream(srcFile);
             OutputStream ous = new FileOutputStream(destFile)
        ) {
            
            int len = -1;
            byte[] buffer = new byte[3];
            while ((len = ins.read(buffer)) != -1) {
                //len 正真读取的内容长度
                ous.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //字符流
    public static void code4() {
        //1.源文件
        //2.目标文件
        //3.输入流（字符流 Reader）
        //4.输出流（字符流 Writer）
        //5.输入流读取数据，输出流写入数据
        //6.关闭流
        
        File srcFile = Paths.get("D:", "a", "student.txt").toFile();
        File destFile = Paths.get("D:", "a", "student_new.txt").toFile();
        
        try (Reader reader = new FileReader(srcFile);
             Writer writer = new FileWriter(destFile)
        ) {
            char[] buffer = new char[1024];
            int len = -1;
            writer.write("文件开始\n");
            while ((len = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, len);
            }
            writer.write("\n文件结束");
        } catch (Exception e) {
        
        }
    }
    
    //Reader Writer
    public static void code5() {
        //1.源文件
        //2.目标文件
        //3.输入流（字符流 Reader）
        //4.输出流（字符流 Writer）
        //5.输入流读取数据，输出流写入数据
        //6.关闭流
        File srcFile = Paths.get("D:", "a", "student.txt").toFile();
        try (BufferedReader reader = new BufferedReader(
                new FileReader(srcFile)
        );
        ) {
            String[] lines = new String[100];
            String line;
            int i = -1;
            while ((line = reader.readLine()) != null) {
                i++;
                lines[i] = line;
            }
            // 100 , 0-99
            Random random = new Random();
            while (true) {
                int index = random.nextInt(100);
                String value = lines[index];
                if (value != null) {
                    System.out.println(value);
                    break;
                }
            }
        } catch (Exception e) {
        }
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        //字节流 -> 字符流  编码
        //字符流 -> 字节流  解码
        
        File srcFile = Paths.get("D:", "a", "student.txt").toFile();
        File destFile = Paths.get("D:", "a", "student_1.txt").toFile();
        
        try (//字节流对象
             FileInputStream inputStream = new FileInputStream(srcFile);
             FileOutputStream outputStream = new FileOutputStream(destFile);
             //字符流对象
             InputStreamReader reader = new InputStreamReader(inputStream);
             OutputStreamWriter writer = new OutputStreamWriter(outputStream)
        ) {
            //按照字符读取
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, len);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}