package java1;

public class CharacterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a='A';
		char b='1';
		
		System.out.println(Character.isLetter(a));		//true
		System.out.println(Character.isLetter(b));		//false
		System.out.println(Character.isLetter('a'));	//true
		
		System.out.println(Character.isDigit(b));		//true
		
		System.out.println(Character.isUpperCase(a));	//true
		System.out.println(Character.isLowerCase(a));	//false
		
		
		
	}

}
