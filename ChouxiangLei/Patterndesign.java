public class Patterndesign{
      public static void main(String[] args){
		  Coffee coffee=new Coffee();
		  coffee.makeDrink();//输出煮咖啡过程
		  System.out.println("------------------");
		  Tea tea=new Tea();
		  tea.makeDrink();//输出煮茶过程
		  System.out.println("------------------");
		  
		  Tea tea1=new Tea();
		  tea1.makeDrink();
	  }
}
//模板设计模式
abstract class Drink{
	public final void makeDrink(){
		if(this.isHotWater()){
			this.boilWater();
		}
		this.waterInputCup();
		this.mainIngredient();
		if(this.isAddMinorIngredient()){
			this.minorIngredient();
		}
	}
    public  final void boilWater(){
		System.out.println("1.烧水");
	}
	 public  final void waterInputCup(){
		System.out.println("2.把水倒入杯子");
	}
	//主料
	public abstract void mainIngredient();
	//辅料
	public abstract void minorIngredient();
	//是否添加辅料
	public boolean isAddMinorIngredient(){
		return true;
	}
	//是否加热水
	public boolean isHotWater(){
			return true;
	}
}

class Tea extends Drink{
	//主料
	public  void mainIngredient()
	{
		System.out.println("3.茶叶放入水中");
	}
	//辅料
	public  void minorIngredient()
	{
		System.out.println("3.柠檬放入水中");
	}
	//是否添加辅料
	public boolean isAddMinorIngredient(){
		return true;
	}
	//是否加热水
	public boolean isHotWater(){
			return false;
	}
}

class Coffee extends Drink{
	//主料
	public  void mainIngredient()
	{
		System.out.println("3.咖啡放入水中");
	}
	//辅料
	public  void minorIngredient()
	{
		System.out.println("3.糖放入水中");
	}
	//是否添加辅料
	public boolean isAddMinorIngredient(){
		return true;
	}
	//是否加热水
	public boolean isHotWater(){
		return true;
	}
}

//模板设计模式
//模版设计模式代码结构
abstract class TemplateAbstractClass{
    
    //模版方法，定义算法
    public final void templateMethod(){
        //按照定义了算法执行程序，可以采用一些流程控制
        this.methodOptional1();
        this.methodOptional2();
        if(this.isSupport()){
            this.methodOptional3();
            this.methodOptional4();
        }
    }
    
    //钩子
    //子类可以根据实现情况，覆写
    public void methodOptional1(){
        //有模版提供了一定的默认实现
    }
    
    //子类完成具体实现
    public abstract void methodOptional2();
    
    //子类可以根据实现情况，覆写
    public void methodOptional3(){
        //有模版提供了一定的默认实现
    }
    
    //子类完成具体实现
    public abstract void methodOptional4();
    
    //子类完成具体实现
    public abstract boolean isSupport();
}
		
		