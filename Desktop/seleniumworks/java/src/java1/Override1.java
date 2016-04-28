package java1;

public class Override1 {
	
	
	public void add(int a,int b){
		System.out.println(a+b);
	}
	
	public void mull(int a,int b){
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Override1 o1=new Override1();
		o1.add(10, 90);
		o1.mull(10, 20);
		
	}

}
