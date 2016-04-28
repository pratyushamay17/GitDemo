package java1;

import java.util.Scanner;

public class Iooperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("enter ur name");
//		String name = scan.nextLine();// gives the whole name
//		System.out.println("ur name is " +name);
//
//		System.out.println("enter full name");
//		String nameur = scan.nextLine(); //gives only first part of given name
//		System.out.println("ur first part of name is " +nameur);
//		
//		System.out.println("enter ur age");
//		int age= scan.nextInt();
//		System.out.println("ur age is "+age);
//		
//		System.out.println("enter mobile");
//		long num=scan.nextLong();
//		System.out.println("mobile num is "+num);
//		
//		System.out.println("enter a numeric value");
//		double num1 = scan.nextDouble();
//		System.out.println("numeric value is " +num1);
//		
//		System.out.println("enter a character");
//		char c=scan.next().charAt(0);
//		System.out.println("ur char is " +c);
//		
//		System.out.println("enter a bool value");
//		Boolean bool = scan.nextBoolean();
//		System.out.println("ur boolean is" +bool);
//		
		System.out.println("enter two numbers");
		String s1=scan.nextLine();
		String s2=scan.next();
		int a=Integer.parseInt(s1); //converting string to integer
		int b=Integer.parseInt(s2);
		System.out.println(a+b);
		scan.close();
		
	}

}
