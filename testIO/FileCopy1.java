package File;
import java.io.*;
/**
 * Author:QiyeSmart
 * Created:2019/5/14
 */
/*
文件拷贝
 */
public class FileCopy1 {
    private static void checkNotEmpty(String str,String message){
        if(str==null||str.length()==0){
            throw new IllegalArgumentException(message);
        }
    }
    private static void checkFile(File file, String message) {
        if (!file.exists() || !file.isFile()) {
            throw new IllegalArgumentException(message);
        }
    }
    private static void checkFileAndMkdir(File file, String message) {
        File parent = file.getParentFile();
        if (!parent.exists()) {
            boolean rs = parent.mkdirs();
            if (!rs) {
                throw new RuntimeException(message);
            }
        }
    }
    public static void copyFile(File sourceFile,File destFile){
        //sourceFile->input
        //destFile->output
        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destFile);
        ) {
            //in -> read -> write -> out
            byte[] buff = new byte[1024 * 1024];
            int len = -1;
            while ((len = in.read(buff)) != -1) {
                out.write(buff, 0, len);
            }
            out.flush();
        } catch (IOException e) {

        }
    }
    public static void cp(String sourceFilePath,String destFilePath){
        //1.校检参数
        checkNotEmpty(sourceFilePath,"sourceFilePath must not be null");
        checkNotEmpty(destFilePath,"destFilePath must not be null");
        //2.检验文件
        File sourceFile=new File(sourceFilePath);
        checkFile(sourceFile,"courceFile must  be exit and file");
        //3.校检和准备目的文件路径
        File destFile=new File(destFilePath);
        checkFileAndMkdir(destFile,"destFile file must must be  exist");
        //4.进行拷贝
        long start=System.currentTimeMillis();
        copyFile(sourceFile,destFile);
        long end=System.currentTimeMillis();
        System.out.println("拷贝时间"+(start-end)+"ms");
    }

    public static void main(String[] args) {

        //cp("D:\\test\\IMessage.java","D:\\test\\b\\IMessage.java");
        //通过命令行参数输入地址
        if (args.length >= 2) {
            String sourceFilePath = args[0];
            String destFilePath = args[1];
            cp(sourceFilePath, destFilePath);
        } else {
            System.out.println("参数不合法");
        }
    }
}
