package java1;

public class Abstract2 extends Abstract1{
	
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("this is kachiguda express");
	}

	public void aeroplane() {
		// TODO Auto-generated method stub
		System.out.println("this is airasia");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract2 a=new Abstract2();
a.Bike();		// accessing parent class methods
a.Scooty();
a.train();
a.aeroplane();


	}


}
