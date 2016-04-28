package java1;

public class Override2 extends Override1{ //we use extends inheritence to access any other methods 
										// also present in parent class other than override method
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Override2 o2=new Override2();
o2.add(30,40);

Override1 o1=new Override1();	//method overriding with non ststic member methods
o1.add(10, 20);
o1.mull(20, 50);
	}

}
