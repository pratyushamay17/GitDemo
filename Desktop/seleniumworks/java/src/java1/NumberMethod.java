package java1;

public class NumberMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int d=10;
		Integer x=a;
		double b= -12.89;
		double c= 13.33;
		
		System.out.println(Math.random());		//gives dynamic output everytime
		
		System.out.println(x.compareTo(4));     //returns 1 as 5>4
		System.out.println(x.compareTo(5));     //0
		System.out.println(x.compareTo(10));	// -1 
		
		System.out.println(x.equals(4));        //false
		System.out.println(x.equals(5));		//true
		System.out.println(x.equals(90));		//false
	
		System.out.println(Math.abs(b));		//gives absolute value
	
		System.out.println(Math.round(c));	    // returns decimal value to nearest integer
		
		System.out.println(Math.min(a, d));    //returns min value
		
		System.out.println(Math.max(a,d));     // returns max value
		
	}
	

}
