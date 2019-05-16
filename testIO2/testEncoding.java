package File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * Author:QiyeSmart
 * Created:2019/5/16
 */
/*
乱码测试
 */
public class testEncoding{
    public static void main(String[] args) {
        //读取java运行属性
      //System.getProperties().list(System.out);
        try(OutputStream out=new FileOutputStream("D:"+File.separator+"test1"+File.separator+"abc.txt")){
            //解码最好选用UTF-8编码
            out.write("阿朵".getBytes(StandardCharsets.ISO_8859_1));
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
