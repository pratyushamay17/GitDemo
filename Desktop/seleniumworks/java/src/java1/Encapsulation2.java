package java1;

public class Encapsulation2 extends Encapsulation1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation2 e2=new Encapsulation2();
e2.setName("this is my new name");  // returns this stmt only as we are setting value before getting it
System.out.println(e2.getName());
	}

}
