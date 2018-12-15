public class FileCopy {
    
    public static void cp(String srcFilePath, String destFilePath) {
        checkArgument(srcFilePath);
        checkArgument(destFilePath);
        checkFileExists(srcFilePath);
        checkFileNotExists(destFilePath);
        checkAndCreateFileParent(destFilePath);
        File srcFile = Paths.get(srcFilePath).toFile();
        File destFile = Paths.get(destFilePath).toFile();
        copy(srcFile, destFile);
    }
    
    
    private static void copy(File srcFile, File destFile) {
        try (FileInputStream ins = new FileInputStream(srcFile);
             FileOutputStream out = new FileOutputStream(destFile)
        ) {
            //增强版本 带缓冲区
            byte[] buffer = new byte[1024];
            int len;
            while ((len = ins.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    private static void checkArgument(String args) {
        if (args == null || args.isEmpty()) {
            throw new IllegalArgumentException("参数不能为空");
        }
    }
    
    //普通文件，并且存在
    private static void checkFileExists(String filePath) {
        Path path = Paths.get(filePath);
        File file = path.toFile();
        if (!(file.exists() && file.isFile())) {
            throw new IllegalArgumentException(filePath + " not exists");
        }
    }
    
    private static void checkFileNotExists(String filePath) {
        Path path = Paths.get(filePath);
        File file = path.toFile();
        if (file.exists()) {
            throw new IllegalArgumentException(filePath + "  exists");
        }
    }
    
    private static void checkAndCreateFileParent(String filePath) {
        File file = new File(filePath);
        File parent = file.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }
    }
    
    public static void main(String[] args) {
        try {
            String src = args[0];
            String dest = args[1];
            cp(src, dest);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("参数不符合要求：srcFilePath destFilePath");
        }
    }
}