package java1;

public class Stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="selenium";
		String b="training";
		String c="training";
		String d= "ROBO";
		String e= "zselenium";
		String f="TRAINING";
		String g="   hello   world  ";
		
		System.out.println(a==b);
		System.out.println(b==c);
		
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		
		System.out.println(a.concat(b));   //string concatenation
		
		System.out.println(d.charAt(2));	//character detection
		
		System.out.println(b.compareToIgnoreCase(f)); //return bool true by ignoring upper case
		
		System.out.println(d.toLowerCase()); //changes from upper to lower case
		
		System.out.println(g.trim());		//trim the spaces in start and end
		
		System.out.println(g.substring(10)); // returns the string starting with index 10
		System.out.println(g.substring(2, 8));//returns string from 2nd char till 8th
		
		System.out.println(g.endsWith("world  ")); //true value
		System.out.println(g.endsWith("hello"));  //false 
		
		System.out.println(b.length());
		
		System.out.println(a.compareTo(d));  //>0 value bcz ascii values of small alphabets 
											//is greater than capital alphabets
		System.out.println(b.compareTo(c)); // 0 bcz both have same ascii values
		System.out.println(a.compareTo(e)); //<0 value bcz ascii values are < e compare to a
		
		
//		System.out.println(a+b);
//		System.out.println("sele" +1+1);
//		System.out.println("1"+1+ a);
		
		
//		String tools="selenium"; //string variable declaration
//		String []mytools= {"rft","qtp","uft","alm"};  //array of strings
//		System.out.println(tools);
//		for(String tool:mytools){
//			System.out.println(tool);
//		}
	}
}
