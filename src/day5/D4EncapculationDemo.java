package day5;

import java.util.Scanner;

public class D4EncapculationDemo {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		Student std = new Student();

		System.out.println("Enter Id");
		// std.id = scanner.nextInt();
		std.setId(scanner.nextInt());
		
		System.out.println("Enter Age");
		// std.age = scanner.nextInt();
		std.setAge(scanner.nextInt());
		
		System.out.println("Enter Name");
		// std.name = name;
		std.setName(scanner.next());
		
		System.out.println(std);
		scanner.close();
	}
}
