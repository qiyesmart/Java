import java.io.*;
import java.util.Properties;

/**
 * Author:QiyeSmart
 * Created:2019/5/22
 */
//Properties属性文件操做
public class testProperties {
    public static void code1(){
        Properties properties=new Properties();
        properties.setProperty("aduo","aduo is pig");
        properties.setProperty("aduo1","aduo1 is pig");
        System.out.println(properties.getProperty("aduo"));
        System.out.println(properties.getProperty("aduo1"));
        System.out.println(properties.getProperty("aduo2"));
        System.out.println(properties.getProperty("aduo2","aduo2 is a big pig"));

        properties.list(System.out);
    }
    public static void code2(){
        Properties properties1=new Properties();
        //Properties对象关联到 .properties文件
        String messageFile="D:\\Java\\projrct-5-11\\src\\message.properties";
        try( Reader reader=new FileReader(messageFile);
        ){
            properties1.load(reader);
            //Properties输出方式
            //Map集合都能用
            properties1.list(System.out);
            System.out.println(properties1.getProperty("java"));
            System.out.println(properties1.getProperty("aduo3"));
            System.out.println(properties1.getProperty("aduo3","aduo3 is a big pig"));
            System.out.println(properties1.size());
            properties1.setProperty("JavaScript","JavaScript很重要");
            properties1.setProperty("c","c语言不简单");
            properties1.list(System.out);
            //将变换后的内容写到文件
            try(FileWriter writer=new FileWriter(messageFile)){
                properties1.store(writer,"修改内容");
            }catch(IOException e){
                e.printStackTrace();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        //通过类加载器加载classpath目录下的.properties文件文件加载到Properties类，与本地系统无关
        Properties properties1=new Properties();
        //Properties对象关联到 .properties文件
        //.properties文件
        //1.文件系统中的目录下放着，和项目没有关系
        //2.文件在项目中，和class文件在一起，资源文件，classpath
        //获得一个类加载器
        ClassLoader classLoader=testProperties.class.getClassLoader();
        //如果在包下，name应该为：包名/message.properties
        try(InputStream in=classLoader.getResourceAsStream("message.properties")){
            properties1.load(in);

            properties1.list(System.out);

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
