package java1;

public class Employee {
String name;
int age;
String designation;
int salary;

public void empname(String name){
	this.name=name;
	this.age=20;
	System.out.println("emplayee name is" +name);
}
public void empAge(int empage){
	this.age=empage;
	System.out.println( "employee age is:"  +age);
}
public void empDesi(String desi){
	designation=desi;
	System.out.println("employee designation is:" +designation);
}
public void empSal(int sal){
	salary=sal;
	System.out.println("employee salary is:" +salary);
}

}
