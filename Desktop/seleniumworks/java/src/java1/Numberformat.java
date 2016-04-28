package java1;

import java.util.Scanner;

public class Numberformat {

	public static void main(String[] args) throws ArithmeticException{
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter two nums");
//		String s1=scan.nextLine();
//		String s2=scan.nextLine();
//		int a = Integer.parseInt(s1);
//		int b = Integer.parseInt(s2);
//		System.out.println(a+b);
//		scan.close();
		
		//below is arithmetic exception
		
		int a=10;
		int b=0;
		try{
		int res=a/b;
		System.out.println(res);
		}
		catch(ArithmeticException e){
			System.out.println("devided by zero error");
		}
		System.out.println("hello chintu");
		
		
		// below is arrayindexoutofbound exception
		
		int [] s1=new int[4];
		int [] s2 ={23,56,67,44};
	
		System.out.println(s2[1]);
	try{
		s1[33]=200;
		System.out.println(s1[33]);
	}
	catch (ArrayIndexOutOfBoundsException e1){
		System.out.println("array declaration is wrong");
	}
	}

}
