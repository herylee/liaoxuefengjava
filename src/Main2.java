import static java.lang.System.out;

public class Main2 {

	public static void main(String[] args) {

		Hello h = new Hello("World");
		out.println(h.hello());

	}
}
	class Hello {

		private final String name;

		public Hello(String name) {

			this.name = name;

		}

		public String hello() {

			return "hello, " + name + "!";

		}

	}
