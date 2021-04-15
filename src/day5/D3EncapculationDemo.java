package day5;

import java.util.Scanner;

public class D3EncapculationDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Student std = new Student();

		System.out.println("Enter Id");
		std.id = scanner.nextInt();
		
		System.out.println("Enter Age");
		std.age = scanner.nextInt();
		
		System.out.println("Enter Name");
		String name = scanner.next(); 
		std.name = name;
		
		
		System.out.println(std.id + std.name );
		scanner.close();
	}
}
