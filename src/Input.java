import java.util.Scanner;

//import java.util.*;

public class Input {

	public static void main(String[] args) {

		Scanner scanner = 	new Scanner(System.in);
		System.out.println("input your name: ");
		String name = scanner.nextLine();// ��ȡ�ַ���
		System.out.println("input your age: ");
		int age=scanner.nextInt();//��ȡ����
		
		System.out.println("name: "+name+" , age is  "+age);
		
	
	}

}
