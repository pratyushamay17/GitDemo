package java1;

public class Interface2 implements Interface1 { //we can access from different package also 
	public void bike(){
		System.out.println("this is hero honda");
	}
	public void scooty(){
		System.out.println("this is scooty streax");
	}
	public void train(){
		System.out.println("this is kachiguda express");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interface2 i=new Interface2();
i.bike();
i.scooty();
i.train();
	}

}
