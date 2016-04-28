package OOPsConcepts;

public class Maruthi extends CarDemo{
String engi;
int year;
	
	Maruthi(String y)
	{
		this.model =y;
		this.model =y;
		this.model = y;
	}
	
	public void printDetails(String engi,int year){
		System.out.println(engi);
		System.out.println(year);
		System.out.println(this.engi);
		System.out.println(this.year);
	}
	
	public static void main(String[] args){
		String x="kkk";
		Maruthi zen = new Maruthi(x);
		System.out.println(zen.model);
	zen.printDetails("old", 1990);
	}

}
