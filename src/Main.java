
public class Main {

	public static void main(String[] args) {

/***		Person p = new Student("xiao ming ");
		
		System.out.println(p.hello());  //打印出来的是引用地址
		
		
		
		Student s = new Student("xiao ming ");

//		p.run();
//		s.run();

***/

		Shape s1 =  new Rect(200,100);
		Shape s2 = new Circle(60);
		
		System.out.println(s1.area());
		System.out.println(s2.area());
		
		

	}

	// System.out.println(s.hello());

}
