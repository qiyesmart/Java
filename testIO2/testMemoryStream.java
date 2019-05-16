package File;

import java.io.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/16
 */
/*
内存流：
1.数据在内存中进行操作，不与文件系统关联；
2.适合处理少量的文件；
 */
public class testMemoryStream {
    //小写转大写
    public static void code1(){
        String message="aduo";
        byte[]  messagebyte=message.getBytes();
        //in out都是内存流
        ByteArrayInputStream in=new ByteArrayInputStream(messagebyte);
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try{
            int c=-1;
            while((c=in.read())!=-1){
                c=c-32;
                out.write(c);
            }
            out.flush();
            byte[] newmessage=out.toByteArray();
            System.out.println(new String(newmessage));
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
       //文件合并
        /*
        方案一：
        1.data1.txt内容复制到data.txt；
          1.data2.txt内容复制到data.txt；
        方案二：
        1.data1.txt复制到内存的输出流；
        2.data2.txt复制到内存的输出流；
        3.内存的输出流-》byte[]字节流
        4.byte[]-》输出到文件的输出流

         */
        File  part1=new File("D:"+File.separator+"test1"+File.separator+"abc.txt");
        File  part2=new File("D:"+File.separator+"test1"+File.separator+"ab.txt");
        File  part3=new File("D:"+File.separator+"test1"+File.separator+"a.txt");
        try(
                FileInputStream in1=new FileInputStream(part1);
                FileInputStream in2=new FileInputStream(part2);
                ByteArrayOutputStream out=new ByteArrayOutputStream();
                FileOutputStream out2=new  FileOutputStream(part3);
                ){
            byte[] buff=new byte[1024];
            int len=-1;
            while((len=in1.read(buff))!=-1){
                out.write(buff,0,len);
            }
            while((len=in2.read(buff))!=-1){
                out.write(buff,0,len);
            }
            out.flush();
            byte[]  data=out.toByteArray();
            out2.write(data);
            out2.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
