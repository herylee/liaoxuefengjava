import java.beans.BeanInfo;

public class Main {

	/***
	 * Person p = new Student("xiao ming "); System.out.println(p.hello());
	 * //打印出来的是引用地址 Student s = new Student("xiao ming "); // p.run(); // s.run();
	 ***/
	// Shape s1 = new Rect(200,100);
	// Shape s2 = new Circle(60);
	// System.out.println(s1.area());
	// System.out.println(s2.area());
	//
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
//
//	String name = "World";
//	StringBuilder sb = new StringBuilder();
//
//	sb.append("hello,  ").append(name).append('!');
//	String s = sb.toString();
//	System.out.println(s);

	
	public static void main(String[] args) throws Exception{


		BeanInfo bi = Introspector.getBeanInfo(Person.class);
		for(Property)
		
		
	}

	// System.out.println(s.hello());

}
