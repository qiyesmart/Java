public class Person implements Serializable {
    
    private transient String name;
    
    private Integer age;
    
    public Person() {
    
    }
    
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    
    public static void main(String[] args) {
        //序列化对象
        Person person = new Person("Jack", 22);
        File outputFile = Paths.get("D:", "test", "person.txt").toFile();
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(outputFile)
        )) {
            out.writeObject(person);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //反序列化对象
        File inputFile = Paths.get("D:", "test", "person.txt").toFile();
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(inputFile)
        )) {
            
            person = (Person) in.readObject();
            System.out.println(person);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        // Object(memory) -> byte[] -> File   序列化
        // File   -> byte[] -> Object(memory) 反序列化
        
        // byte[] -> String  编码
        // String -> byte[]  解码
        
        //Object -> JSON  编码
        //JSON  -> Object 解码
        
        //Object -> XML
        //XML -> Object
        
    }
}