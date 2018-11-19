import java.util.Random;
import java.util.Scanner;
public class GuessNum{
      public static void main(String[] args){
	  System.out.println("欢迎进入猜数字游戏！");
	   System.out.println("请输入一个数字：");
	   Random random=new  Random();
	   int pcnum=random.nextInt(100);
	   Scanner  input=new Scanner(System.in);
	   int count=5;
	   while(count>0){
	    System.out.println("您有"+count+"次机会！");
		count--;
		 System.out.println("请输入数字");
		 int usernum=input.nextInt();
		 if(usernum==pcnum){
			  System.out.println("猜对了！");
			  break;
		 }
		 else if(usernum>pcnum){
			  System.out.println("猜大了！");
		 }
		 else if(usernum<pcnum){
			  System.out.println("猜小了！");
		 }
	}
	  System.out.println("游戏结束！");
	  input.close();
}
}