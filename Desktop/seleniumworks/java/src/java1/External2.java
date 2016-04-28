package java1;

import java.util.Scanner;

public class External2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		
		String s1="20";
		String s2="30";
		
		int a= Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		System.out.println(a+b);
		scan.close();

		//calling external method (must be static) without object
		External1.multiply(10,20);
		
		
		//calling external method by invoking object
//		External1 e1=new External1();
//		e1.multiply(90, 100);
		

	}

}
