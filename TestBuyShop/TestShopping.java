public class TestShopping{
    
    public static void main(String[] args){
        
        Jd jd = new Jd();
        jd.shopping();
        
        System.out.println("-------------");
        
        jd.setCallService(true);
        jd.shopping();
    }

}

abstract class OnlineShopping{
    
    
    public final void shopping(){
        this.showGoods();
        this.selectGoods();
        if(isCallService()){
            this.callService();
        }
        this.sendGoods();
        this.computePrice();
        this.orderPay();
        this.showOrder();
    }
 
    public void showGoods(){
        System.out.println("1.浏览商品");
    }
     
    public void selectGoods(){
        System.out.println("2.选择商品");
    }
      
    public abstract void callService();
    
    public abstract void sendGoods();
     
    public abstract void computePrice(); 
    
    public abstract void orderPay(); 
    
    public void showOrder(){
        System.out.println("7.查看商品");
    }
    
    public boolean isCallService(){
        return false;
    } 
}


class Jd extends OnlineShopping{
    
    private boolean callService = false;
    
    public void callService(){
        System.out.println("3.京东客服服务");
    }
    
    public void sendGoods(){
        System.out.println("4.京东快递服务");
    }
     
    public void computePrice(){
        //业务逻辑
        System.out.println("5.计算付款");
    }
    
    public void orderPay(){
        //业务逻辑
        System.out.println("6.京东白条");
    }
    
    public void setCallService(boolean callService){
            this.callService = callService;
    }
    
    public boolean isCallService(){
        return this.callService;
    } 
  
}