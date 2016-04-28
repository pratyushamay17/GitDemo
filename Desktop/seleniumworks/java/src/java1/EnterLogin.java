package java1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.apsrtconline.in/oprs-web/login/show.do");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter username");
		String name=scan.nextLine();
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys(name);
		
		System.out.println("enter password");
		String pswd=scan.nextLine();
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(pswd);
		d.findElement(By.xpath("//input[@id='submitBtn']")).click();
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String url=d.getCurrentUrl();
		if(url.equals("http://www.apsrtconline.in/oprs-web/ticket/cancel.do?l=1")){
			System.out.println("login successfull");
		}
		else{
			System.out.println("login failed");
		}
		scan.close();
	}

}
