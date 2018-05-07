
public class Student extends Person {

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int score;

	public int getScore() {

		return score;

	}

	public void setScore(int score) {

		this.score = score;

	}

	public void run() {

		System.out.println("student" + getName() + "is running!");

	}

	
	//覆写了父类的方法
	public String hello() {

		return super.hello()+"!";

	}

}
