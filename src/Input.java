import java.util.Scanner;

//import java.util.*;

public class Input {

	public static void main(String[] args) {

		Scanner scanner = 	new Scanner(System.in);
		System.out.println("input your name: ");
		String name = scanner.nextLine();// 获取字符串
		System.out.println("input your age: ");
		int age=scanner.nextInt();//获取整数
		
		System.out.println("name: "+name+" , age is  "+age);
		
	
	}

}
