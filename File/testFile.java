package File;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * Author:QiyeSmart
 * Created:2019/5/13
 */
/*
FIle:关联到本地文件系统的一个文件和目录
科普：
1.windows平台下文件名是不区分大小写的，LInux下区分；
2.windows平台文件路径分隔符\，Linux是/。
3.windows下路径分隔符;,而linux下是：号。
 */
public class testFile {
    //创建文件
    public static void code1(){
        //1.将本地文件系统关联到JAVA的File对象
        File file=new File("D:"+File.separator+"阿朵"+File.separator+"aduo1.txt");
        //判断文件是否存在
        if(file.exists()){
            System.out.println("文件存在");
            //删除文件
            /*
            boolean rs=file.delete();
            if(rs){
                System.out.println("文件存在，删除成功");
            }else{
                System.out.println("文件存在，删除失败");
            }*/
        }else{
            try {
                boolean re=file.createNewFile();
                if(re){
                    System.out.println("文件不存在，创建成功");
                }else{
                    System.out.println("文件不存在，创建失败");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public static void  code2(){
        String  directory="D:"+File.separator+"阿朵";

        File file=new File("D:"+File.separator+"阿朵"+File.separator+"a"+File.separator+"b");
        if(file.exists()){
            file.delete();
        }else{
            //mkdir只会创建当前目录，如果父目录不存在，创建失败
            //mkdirs创建目录，如果父目录不存在，一并会创建
            if(file.mkdirs()){
                System.out.println("目录创建成功");
            }else{
                System.out.println("目录创建失败");
            }
        }
    }
    public static void main(String[] args) {
        String  directory="D:"+File.separator+"阿朵"+File.separator+"a"+File.separator+"b";
        File file=new File(directory,"aaa.txt");
        //是否存在
        System.out.println(file.exists());
        //是否是文件
        System.out.println(file.isFile());
        //是否是目录
        System.out.println(file.isDirectory());
        //是否是隐藏文件
        System.out.println(file.isHidden());
        //文件大小（字节）
        System.out.println(file.length());
        //最近的修改时间
        System.out.println(new Date(file.lastModified()));
    }
}
