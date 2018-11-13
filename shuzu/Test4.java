import java.util.Arrays;
public class Test4{
	public static void main(String[] args) {
		code11();
	}
	//动态声明数组
	public static void code1(){
		int[] intArray=new int[3];
		//数组声明以及空间分配
	    for (int i = 0; i<3 ; i++) {
	    System.out.println(intArray[i]) ;
		}
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		 for (int i = 0; i<3 ; i++) {
	    System.out.println(intArray[i]) ;
		}
		
	}
	//引用数据传递
      public static void code2(){
	    int[] temp=null;//声明temp
		int[] intArray=new int[3];
		//数组声明以及空间分配
	    for (int i = 0; i<3 ; i++) {
	    System.out.println(intArray[i]) ;
		}
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		 for (int i = 0; i<3 ; i++) {
	    System.out.println(intArray[i]) ;
		}
		temp=intArray;
		temp[0]=55;//改变数据
		 System.out.println(intArray[0]) ;
	}
	//静态声明数组
		public static void code3(){
		//完整格式
		//int[] intArray=new int[] {1,2,3,4};
		//简单格式
		int[] intArray={1,2,3,4};
		for (int i = 0; i<3 ; i++) {
	    System.out.println(intArray[i]) ;
		}
		  System.out.println(new char[]{'A','B'}) ;
	}
	//	public static void main(String[] args) {
	//	for (int i = 0; i<args.length ; i++) {
	 //   System.out.println(args[i]) ;
	//	}
	//}
	//动态声明二维数组
	public static void code5(){
		int[][] intArray=new int[2][2];
		intArray[0][0]=1;
		intArray[0][1]=2;
		intArray[1][0]=3;
		intArray[1][1]=4;
		for (int i = 0; i<intArray.length ; i++) {
			for(int j=0;j<intArray[i].length;j++){
				System.out.println(intArray[i][j]) ;
			}
			System.out.println() ;
	}
	}
     public static void printArray(int[][] intArray){
		 for (int i = 0; i<intArray.length ; i++) {
			for(int j=0;j<intArray[i].length;j++){
				System.out.println(intArray[i][j]+" ") ;
			}
			System.out.println() ;
	}
	}
	//数组扩充2倍
     public static void printArray2(int[][] intArray){
		 for (int i = 0; i<intArray.length ; i++) {
			for(int j=0;j<intArray[i].length;j++){
				intArray[i][j]=intArray[i][j]*2;
			}
		 }
		 for (int i = 0; i<intArray.length ; i++) {
			for(int j=0;j<intArray[i].length;j++){
				System.out.println(intArray[i][j]+" ") ;
			}
			System.out.println() ;
	}
	}
	//静态声明二维数组
    public static void code6(){
		int[][] intArray=new int[][]{
			{1,2,3},{4,5,6}
		};
		 printArray2(intArray);
	}
    public static void printArray3(int[] intArray){
	   for (int i = 0; i<intArray.length ; i++) {
	    System.out.println(intArray[i]) ;
		}
    }
	public static void printArray4(char[] intArray){
	   for (int i = 0; i<intArray.length ; i++) {
	    System.out.println(intArray[i]) ;
		}
    }
	//连接两个数组
	public static int[] arrayJoin(int[] a,int[] b){
		int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=a.length;i<c.length;i++){
			c[i]=b[i-a.length];
	    }
		return c;
	}
	public static void code7(){
		int[] a={1,2,3};
		int[] b={4,5,6};
		int[] c=arrayJoin(a,b);
		printArray3(c);
	}
	//数组排序
	public static void intArraySort1(int[] a){
		Arrays.sort(a);
	}
	public static void intArraySort2(char[] b){
		Arrays.sort(b);
	}
	public static void code8(){
		int[] a={1,2,3,7,9,6};
		char[] b={'a','c','b'};
		intArraySort1(a);
		 printArray3(a);
		intArraySort2(b);
		 printArray4(b);
	}
   //数组复制
	public static void code9(){
		int[] dataA = new int[]{1,2,3,4,5,6,7,8,9} ;
		int[] dataB = new int[]{11,22,33,44,55,66,77,88,99} ;
		System.arraycopy(dataB,4,dataA,1,3) ;
		printArray3(dataA);
	}
	public static void code10(){
		int[] original = new int[]{1,3,5,7,9};
		int[] result = Arrays.copyOf(original,10);
		printArray3(result);
	}
	//数据统计
	public static void code11(){
		int[] a=new int[]{1,2,3,4,7,6,5,8};
		int max=a[0];
		int min=a[0];
		int sum=a[0];
		for(int i=1;i<a.length;i++){
			sum+=a[i];
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println((double)sum/a.length);
	}
}
		 