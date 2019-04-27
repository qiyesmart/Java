package ConsumerAndProducter;

/**
 * Author:QiyeSmart
 * Created:2019/4/27
 */
/*
商品信息
 */
public class Goods {
    private final String id;
    private  final String name;
    public Goods(String id,String name){
        this.id=id;
        this.name=name;
    }
    public String  getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
