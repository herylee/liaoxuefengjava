
public class Person {

	private String name;
	private int age;

	
//	构造方法
	
	public Person(String name,int age) {
		
		this.name =name;
		this.age=age;
			
	}
	
	
	public Person() {
		
		this("Unamed",20);
		 
		
		
	}
	

	
	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name.trim();

	}

	public int getAge() {

		return age;

	}

	public void setAge(int age) {

		this.age = age;

	}

	private   int calcBirth(int currentYear) {
		
		return currentYear - this.age;
		
	}
	
	public int getBirth() {
		
		return calcBirth(2016);
		
	}
	

}
