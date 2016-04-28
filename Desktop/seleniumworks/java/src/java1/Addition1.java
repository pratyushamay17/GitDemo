package java1;

public class Addition1 {
	
	public int multiply(int a, int b, int c){
		int res;
		res= (a*b)*c;
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 a=new Addition1();
		int x= a.multiply(10,20,40);
		System.out.println(x);
//int a=10, b=30;
//System.out.println(+(a+b));
//
//if(a>b)
//{ System.out.println("a is big");
//	}
//else{
//	System.out.println("b is big");
//}

//for(int d=1; d<=10; d++){
//	System.out.println(d);
//}
}
}
