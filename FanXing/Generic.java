public class Generic<T> {
    
    private T data;

//    public <T> void print(T value) {
//        System.out.println(value);
//    }
    
    //better
    public <P> void print(P value) {
        System.out.println(value);
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
    
    public static void main(String[] args) {
        Generic<String> generic = new Generic<>();
        generic.setData("泛型类的属性");
        System.out.println(generic.getData());
        
        generic.print(123);
        
        
    }
}