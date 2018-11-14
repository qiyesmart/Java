public class ArrayUtils{

    //1.计算数组中最大值
    public static int arrayMaxElement(int[] data){
		int max=data[0];
		for(int i=1;i<data.length;i++){
			if(data[i]>max)
				max=data[i];
		}
	return max;
  }  
    //2.计算数组中最小值
	 public static int arrayMinElement(int[] data){
		int min=data[0];
		for(int i=1;i<data.length;i++){
			if(data[i]<min)
				min=data[i];
		}
	return min;
  }  
    
    //3.计算数组值之和
    public static int arrayElementSum(int[] data){
		int sum=data[0];
		for(int i=1;i<data.length;i++){
			sum+=data[i];
		}
	return sum;
    }
   
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
     int[] c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		for(int i=a.length;i<c.length;i++){
			c[i]=b[i-a.length];
	    }
		return c;
	   }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] data, int start , int end){
       int[] c=new int[6];
	   for(int i=start;i<end;i++){
	       c[i]=data[i];
	   }
	   return c;
    }
    
    //6.数组打印
    public static void printArray(int[] data){
       for (int i = 0; i<data.length ; i++) {
       System.out.println(data[i]+" ") ;
    }
	System.out.println() ;
	}
 
    //7.数组反转
    public static void printReversal(int[] data){
		int begin=0;
		int end=data.length-1;
		while(begin<end){
		if(data[begin]<data[end]){
		int d=data[begin];
		data[begin]=data[end];
		data[end]=d;
		}
		begin+=1;
		end-=1;
		}
	}
	
    public static void main(String[] args) {
	   int[] data={1,2,3,4,5};  
	   int[] a={1,2,3};
	   int [] b={4,5,6};
       int start=0;
	   int end=data.length-2;
	   //打印最大值
       int max=arrayMaxElement(data);
      System.out.println(max+" ") ;
	  System.out.println() ;
	  打印最小值
	   int min=arrayMinElement(data);
	   System.out.println(min+" ") ;
	  System.out.println() ;
	  //打印和
	   int sum=arrayElementSum(data);
	   System.out.println(sum+" ") ;
	   System.out.println() ;
	   //合并数组
		int[] c=arrayJoin(a,b);
		printArray(c);
		//截取数组
		int[] d=arraySub(data,start,end);
		 printArray(d);
		 //逆置数组
		 printReversal(data);
		 printArray(data);
	}
}