package java1;

public class Encapsulation1 {
	private String name="Selenium Training";
	
	public String getName(){
		return name;
	}
	public void setName(String newName){
		name=newName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation1 e=new Encapsulation1();
e.setName("hello");		// displays only hello as we are setting the value before getting it
System.out.println(e.getName());

	}

}
