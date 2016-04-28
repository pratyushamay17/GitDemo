package java1;

public abstract class Abstract1 {
	
	public void Bike(){
		System.out.println("this is a bike");		
	}
public void Scooty(){
	System.out.println("this is scooty pep");
}

public abstract void train();	//only method declaration
public abstract void aeroplane();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract2 a2=new Abstract2(); //we can access both child and parent class methods  
							//by creating object in child class name only
	a2.aeroplane();
	a2.train();
	}

}
