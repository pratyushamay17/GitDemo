package OOPsConcepts;

public class CarDemo {
	
	protected String model;
	public String engine;
	private int year;
	
	CarDemo()
	{
		this.model = "xxx";
		this.engine = "zzz";
	}
	
	CarDemo(String model, String engine)
	{
		this.model = "xxx";
		this.engine = "zzz";
	}
	
	public String getmodel(){
		return this.model;
	}
	
	public void setmodel(String mname){
		this.model=mname;
	}
	public String getengine(){
	return	this.engine;
	}
	public void setengine(String engi){
		this.engine=engi;
	}
	public int getyear(){
		return this.year;
	}
	public void setyear(int x){
		
		this.year=x;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	CarDemo c=new CarDemo();
c.setmodel("maruthi");
c.setengine("old");
c.setyear(1990);
System.out.println(c.getmodel());
System.out.println(c.getengine());
System.out.println(c.getyear());




}
}



