package java1;

public class StringArray {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		String mytool="selenium";
		String [] mytools={"uft", "selenium","rft"};
		int [][] a1 ={{1,2,34,56},{3,5,66,77}};
		
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<(a1[i].length);j++){
				System.out.println(a1[i][j]);
			}
		}
		System.out.println(mytool);
		for(String tool:mytools){
			System.out.println(tool);
		}
		String s="training";
		System.out.println(mytool +s +1+1);
		System.out.println(1+1+s);
		try{
		System.out.println(mytools[8]);
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("out of limit");
		}
	}
		

}
