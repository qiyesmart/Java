public class TestFile {
    
    //创建文件
    public static void code1() {
        File file = new File("D:\\java2.txt");
        //  File file =new File("/User/home/java.txt");//linux unix
        try {
            boolean rs = file.createNewFile();
            if (rs) {
                System.out.println("创建文件成功");
            } else {
                System.out.println("创建文件失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //创建文件，创建父目录
    public static void code2() {
        // mkdir -p /test1/hello.java
        File file = new File("D:\\test1\\hello.java");
        try {
            File parent = file.getParentFile();
            if (parent.mkdirs()) {
                boolean rs = file.createNewFile();
                if (rs) {
                    System.out.println("创建文件成功");
                } else {
                    System.out.println("创建文件失败");
                }
            } else {
                System.out.println("创建父目录失败" + parent.getPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void code3() throws IOException {
        
        File file = new File("D:" + File.separator + "test" + File.separator + "ABC.txt");
        
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("文件存在删除成功");
            } else {
                System.out.println("文件存在删除失败");
            }
        } else {
            if (file.createNewFile()) {
                System.out.println("文件不存在创建成功");
            } else {
                System.out.println("文件不存在创建失败");
            }
        }
    }
    
    //文件信息
    public static void code4() {
        File file = new File("D:" + File.separator + "__download" + File.separator + "VirtualBox-5.2.22-126460-Win.exe");

//        File file = new File("D:" + File.separator + "__download");
        System.out.println("是否是文件：" + file.isFile());
        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否隐藏：" + file.isHidden());
        System.out.println("最后修改时间：" + new Date(file.lastModified()));
        // 1024 数据的计算进制
        // 1000 制造商的计算方式
        // 1G = 1000MB
        System.out.println("文件大小：" + file.length());
        
        
    }
    
    public static void code5() {
        File file = new File("D:" + File.separator + "__download");
        
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null) {
                System.out.println("无列举内容");
            } else {
                for (File f : files) {
                    //System.out.println(f.getName());
                    System.out.println(f.getAbsolutePath());
                }
            }
        } else {
            System.out.println("不是目录，所以不能列举文件");
        }
    }
    
    //辅助类
    public static void code6() {
        //java.io.File
        //java.nio.file.Path
        //java.nio.file.Paths
        //java.nio.file.Files
        Path path = Paths.get("D:", "a", "b");//D:\\a
        try {
            //通过Path获取File对象
            File file = path.toFile();
            System.out.println(file.getAbsolutePath());
            //通过Files辅助类删除Path
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Path path1 = Paths.get("D:", "ab", "c");
        Path path2 = Paths.get("D:", "ab");
        System.out.println(path1.startsWith(path2));//true
    }
    
    
    public static void main(String[] args) {
    
    
    }
    
    private static String space(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
    
    //rm -rf
    public static void rmFiles(File file, int i) {
        if (file.isFile()) {
            file.delete();
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        f.delete();
                    } else {
                        findFiles(f, i + 2);
                    }
                }
            }
        }
    }
    
    public static void findFiles(File file, int i) {
        if (file.isFile()) {
            System.out.println(space(i) + file.getName());
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isFile()) {
                        System.out.println(space(i) + "|" + f.getName());
                    } else {
                        System.out.println(space(i) + "+" + f.getName());
                        findFiles(f, i + 2);
                    }
                }
            }
        }
    }
}