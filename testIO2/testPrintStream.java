package File;

import java.io.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/16
 */
/*
系统输入与输出
 */
public class testPrintStream {
    public static void code1(){
        String file="D:"+File.separator+"test1"+File.separator+"abc.txt";
        try(PrintWriter writer=new PrintWriter(file);){
            /*
            writer.write(50);
            writer.write("aduoaduo");
            writer.write("\n");
            writer.append("A");
            writer.flush();*/
            //格式化输出1
            //writer.printf("姓名：%s年龄：%d 身高： %.2f cm","阿朵" ,22,180.25F);
            //格式化输出2
            String str=String.format("姓名：%s年龄：%d 身高： %.2f cm","阿朵" ,22,180.25F);
            writer.println(str);
            writer.flush();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //系统输出
    public static void code2(){
        //System.out.println System类名(一个Java类) out成员属性（System里面的一个成员静态属性，是一个PrintStream类型）
        /*
        try{
            Integer.parseInt("abc");
        }catch(NumberFormatException e){
            //记录程序运行时的信息，通常在Java开发中不采用System.out， System.err
            //才有日志系统
            System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        }*/
        //使用System.out为OutputStream实例化
        OutputStream out=System.out;
        try{
            out.write("hello".getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void code3(){
        //系统输入1
        //只能够接收部分数据
        InputStream in=System.in;
        try{
            byte[]  buff=new byte[5];
            int len=in.read(buff);
            System.out.println(len+new String(buff,0,len));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //系统输入2
        //引入内存操作
        //流来进行控制，这些数据先保存在内存流中而后一次取出
        InputStream in=System.in;
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try{
            byte[]  buff=new byte[5];
            int len=-1;
            while((len=in.read(buff))!=-1){
                out.write(buff,0,len);
                if(len<buff.length){
                    break;
                }
            }
            byte[]  data=out.toByteArray();
            System.out.println(data.length+new String(data));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
