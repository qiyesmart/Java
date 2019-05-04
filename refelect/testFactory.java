package refelect;

/**
 * Author:QiyeSmart
 * Created:2019/5/4
 */
//工厂与反射
public class testFactory {
    public static void main(String[] args) {
        Fruit fruit=FruitFactory.getFruitInstance("refelect.Apple");
        if(fruit!=null) {
            fruit.eat();
        }
    }

}
interface  Fruit{
    void eat();
}
class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}
class Orange implements Fruit{
    public void eat(){
        System.out.println("吃橘子");
    }
}

class FruitFactory{
    public static Fruit getFruitInstance(String fruitName) {
        try {
            Class classz = Class.forName(fruitName);
            return (Fruit) classz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    }
