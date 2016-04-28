package java1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaptureErrorMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.gcrit.com/build3/admin");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter user name");
		String name= scan.nextLine();
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		
		System.out.println("enter password");
		String pswd=scan.nextLine();
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(pswd);
		d.findElement(By.id("tdb1")).click();
		
		try{
		String error=d.findElement(By.className("messageStackError")).getText();
		if(error.contains(" Error: Invalid administrator login attempt.")){
			System.out.println("handling invalid inputs");
		}
		}
		catch(NoSuchElementException e){
			System.out.println("handling valid inputs");
		}
		d.close();
		scan.close();
	}

}
