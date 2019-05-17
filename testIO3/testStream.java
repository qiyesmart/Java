package File;

import java.io.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/14
 */
/*
Stream流操作
 */
public class testStream {
    //字节输出流(OutputStream)
    public static void code1(){
        String  directory="D:"+File.separator +"阿朵"+File.separator+"a"+File.separator+"b";
        File file=new File(directory,"aaa.txt");
        /*
        OutputStream out=null;
        try {
            //如果不追加内容，append置为null
             out=new FileOutputStream(file);
             out.write("aduo  is pig".getBytes());
             out.flush();
            } catch (FileNotFoundException e) {
            e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
        }finally{
            //关闭流
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        //try-with-resources方法 自动关闭资源（一个类实现类closeAble接口，java会自动关闭它）
        //try catch执行完后，虚拟机会自动调用close方法
        try(OutputStream out=new FileOutputStream(file);
            Message ms=new Message();) {
            ms.print();
            out.write("aduo  is pig".getBytes());

            //可以写ascii int类型
            out.write(49);
            String message="HelloWorld";
            byte[] buff=message.getBytes();
            //将内容变为字节数组
            out.write(buff,1,5);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    //字节输入流：InputStream
    public static void code2(){
        String  directory="D:"+File.separator +"阿朵"+File.separator+"a"+File.separator+"b";
        File file=new File(directory,"aaa.txt");
        if(file.exists()&&file.isFile()){
            try(FileInputStream in=new FileInputStream(file)) {
                    /*byte[] data=new byte[7];
                    int len=in.read(data);
                    System.out.println("读取数据的长度"+len);
                    System.out.println("读取的数据"+new String(data));
                    //读出来是ascii
                    System.out.println(in.read());*/
                //读取全部内容
                //方式1
                    /*int d=-1;
                    while((d=in.read())!=-1){
                        System.out.println((char)d);
                    }*/
                //方式2
                    /*int length=in.available();
                    byte[] data=new byte[length];
                    int len=in.read(data);
                    System.out.println("读取数据的长度"+len);
                    System.out.println("读取的数据"+new String(data));*/
                //方式3
                byte[] buff=new byte[5];
                int len=-1;
                while((len=in.read(buff))!=-1){
                    System.out.print(new String(buff,0,len));
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //字符输出流：Writer
    public static void code3(){
        String  directory="D:"+File.separator +"阿朵"+File.separator+"a"+File.separator+"b";
        File file=new File(directory,"aaa.txt");
        try(Writer writer=new FileWriter(file)){

            writer.write("阿朵是猪");
            writer.write("\n");
            writer.write("阿朵朵");
            writer.write("\n");
            writer.write("猪小朵");
            writer.write("\n");
            writer.write("包二朵");
            writer.write("\n");
            writer.write(new char[]{'a','b'});
            //刷新
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //字符输入流：Reader
    public static void code4(){
        String  directory="D:"+File.separator +"阿朵"+File.separator+"a"+File.separator+"b";
        File file=new File(directory,"aaa.txt");
        try(Reader reader=new FileReader(file)){
            char[]  buff=new char[10];
            int len=-1;
            while((len=reader.read(buff))!=-1){
                System.out.print(new String(buff,0,len));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    //
    public static void main(String[] args) {
        String  directory="D:"+File.separator +"阿朵"+File.separator+"a"+File.separator+"b";
        File file=new File(directory,"aaa.txt");
        //字节输出流转字符流
        try(FileInputStream in=new FileInputStream(file);
            //字节流转换为字符流
            InputStreamReader reader=new InputStreamReader(in);
        ){
            char[]  buff=new char[1024];
            int len=-1;
            while((len=reader.read(buff))!=-1){
                System.out.print(new String(buff,0,len));
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        //字节输入流转字符流
        try(OutputStream out=new FileOutputStream(file);
        OutputStreamWriter writer=new OutputStreamWriter(out);
        ){
            writer.write("adduo");
            writer.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//验证AutoCloseable（资源关闭）

class Message implements AutoCloseable{
    public void print(){
        System.out.println("Message print执行");
    }
    public void close() throws Exception{
        System.out.println("Message是个资源对象，关闭资源");
    }
}
