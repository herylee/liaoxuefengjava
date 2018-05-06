
public class Switch {

	public static void main(String[] args) {

		int op = 2;

		switch (op) {

		case 1:
			System.out.println("11111");

			break;
		case 2:
			System.out.println("2222");

			//$FALL-THROUGH$
		case 3:
			System.out.println("3333");

		default:
			System.out.println("5555");
			
		}

	}

}
