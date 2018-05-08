
public class Main {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings({ "rawtypes", "unused" })
		Class cls = Main.class;
		Main.hello();
	}

	
	@Deprecated 
	public static void hello() {	
		
	}
	@Override
	public String toString() {

		return "Main";
	}

}

/***
 * Person p = new Student("xiao ming "); System.out.println(p.hello());
 * //打印出来的是引用地址 Student s = new Student("xiao ming "); // p.run(); // s.run();
 ***/
// Shape s1 = new Rect(200,100);
// Shape s2 = new Circle(60);
// System.out.println(s1.area());
// System.out.println(s2.area());
//

// Person p1 = new Person("xiaoming");
// System.out.println(Person.getNumber());
//
// Person p2 = new Person("xiaoming");
// System.out.println(Person.getNumber());
//
// Person p3 = new Person("xiaoming");
// System.out.println(Person.getNumber());
//
