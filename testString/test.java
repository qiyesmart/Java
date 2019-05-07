package testString;

/**
 * Author:QiyeSmart
 * Created:2019/5/7
 */
public class test {
    //判断一个字符串是不是由数字组成
    public static boolean isNumber(String str){
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            char c=data[i];
            if(c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
    public static void code1(){
        //字符与字符串转换
        String str="aduoduo";
        //转换索引位置单个字符
        System.out.println(str.charAt(0));
        //将字符串变成字符数组
        char[] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            data[i]-=32;
            System.out.println(data[i]);
        }
        System.out.println(new String(data)); // 全部转换为字符串
        System.out.println(new String(data,0,2)); // 部分转换为字符串
        //判断一个字符串是否全部由数字组成
        String str1="1234";
        System.out.println(isNumber(str1));
    }
    public static void code2(){
        //字节与字符串
        //字节用在二进制流
        String str="aduoduo";
        //字符串以字节数组形式返回
        byte[] data=str.getBytes();
        for(int i=0;i<data.length;i++){
            //data[i]-=32;
            System.out.println(data[i]);
        }
        System.out.println(new String(data)); // 全部转换

    }
    public static void code3(){
        // 字符串比较
        String str1="Hello";
        String str2="hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
    }
    public static void code4(){
        //字符串查找
        String str1="Helloadudouo";
        System.out.println(str1.contains("a"));
        System.out.println(str1.startsWith("aduo"));
        System.out.println(str1.endsWith("aduo"));
    }
    public static void code5(){
        //字符串替换
        String str1="aduoduozhu";
        System.out.println(str1.replaceAll("a","b"));
        System.out.println(str1.replaceFirst("a","c"));
    }
    public static void code6(){String str1="he-llo-wo-rld";
        String[] result= str1.split("-");
        for(String s: result) {
            System.out.println(s);
        }
        String[] result1= str1.split("-",2);
        for(String c: result1) {
            System.out.println(c);
        }
        //单词拆分
        String str3 = "192.168.1.1" ;
        String[] result3 = str3.split("\\.") ;
        for(String s: result3) {
            System.out.println(s);
        }
        //多次拆分
        String str4 = "yuisama:27|yui:25" ;
        String[] result4 = str4.split("\\|") ;
        for (int i = 0; i < result4.length; i++) {
            String[] temp = result4[i].split(":") ;
            System.out.println(temp[0]+" = "+temp[1]);
        }}

    public static void main(String[] args){
        String str = "helloworld" ;
        //从指定部分截取到末尾
        System.out.println(str.substring(5));
        //截取部分内容
        System.out.println(str.substring(0, 5));

    }
}
