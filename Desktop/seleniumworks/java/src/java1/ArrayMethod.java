package java1;

import java.util.Arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a ={2,5,78,34};
		String [] b={"selenium","rft","uft"};
//		String str=Arrays.toString(b);
//		System.out.println(str);
		String s=Arrays.toString(a);//will result an array list
		System.out.println(s);
//or u can use for loop also to print arraylist it displays in form of list
		for(String tool:b){
			System.out.println(tool);
		}
		//or u can use as below
		for(int i=0;i<a.length;i++)// gives list of elements in array a
		{
			System.out.println(a[i]);
		}
		
		boolean bool=Arrays.asList(b).contains("uft");
		System.out.println(bool);
		boolean bool1=Arrays.asList(b).contains("rft1");
		System.out.println(bool1);
		boolean bool2=Arrays.asList(a).contains(4);
		System.out.println(bool2);
	
		
		System.out.println(a.length);
		System.out.println(b.length);
		

	}

}
