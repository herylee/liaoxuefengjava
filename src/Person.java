
public class Person {

	private String name;
	private int age;

	
	private	static int number;
	
	
	public Person(String name) {
		this.name = name;
		number++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public String hello() {
		
		return "hello, "+this.name;
		
	}
	
	
	
	
	public void run() {

		System.out.println(name + "is aaa!");

	}

	public String toString() {

		return "preson " + this.name;

	}

	
	public static int getNumber() {
		
		return number;
	}
	
	
	
}
