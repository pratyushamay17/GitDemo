package java2;
import java1.Inheritance1;   //bcz we hav protected method in Inheritance1 class we import 
							//java1 package here
public class Inheritance2 extends Inheritance1{

	//static int a;	//we are accessing static method with no return type
	//static int b;
	public static void add(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance2 i2=new Inheritance2();
		i2.mull();		//accessing parent method in child class
		Inheritance2.add(30,40);

	}

}
