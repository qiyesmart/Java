package File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;

/**
 * Author:QiyeSmart
 * Created:2019/5/16
 */
/*
自己设计一个简单打印流
 */

public class testUtil {
    private final OutputStream out;
    public testUtil(OutputStream out){
        this.out=out;
    }
    public void print(String value){
        try{
            this.out.write(value.getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void println(String value) {
        this.print(value);
        try {
            this.out.write((int) '\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(int value){
        this.print(String.valueOf(value));
    }
    public void println(int value){
        this.println(String.valueOf(value));
    }

    public static void main(String[] args) {
        try(
                FileOutputStream out=new FileOutputStream("D:"+File.separator+
                        "test1"+File.separator+"abc.txt");){
            testUtil in=new testUtil(out);
            in.print(10);
            in.print("aduo");
            in.println(22);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
