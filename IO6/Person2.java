class Person2 implements Serializable{
	private transient String name ;
	private int age ;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	}
	public class TestPrint {
	public static final File FILE = new File("/Users/yuisama/Desktop/testSer.txt") ;
	public static void main(String[] args) throws Exception {
		// ser(new Person("yuisama", 25)) ;
		dser();
	}
	public static void ser(Object obj) throws FileNotFoundException, IOException {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE)) ;
	oos.writeObject(obj ) ;
	oos.close() ;
	}
	public static void dser() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE)) ;
		System.out.println(ois.readObject()) ;
		ois.close() ;
	}
}