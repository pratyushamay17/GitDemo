package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.co.in");
		System.out.println(d.findElement(By.xpath("//div[@id='hplogo']")).isDisplayed());
		System.out.println(d.findElement(By.xpath("//div[@id='hplogo']")).getAttribute("title"));
		d.navigate().to("http://newtours.demoaut.com/");
		d.findElement(By.xpath("//input[@alt='Sign-In']")).click();
		d.navigate().to("http://www.seleniumhq.org/");
		d.findElement(By.xpath("//img[@alt='Selenium IDE Logo']")).click();
		
	}

}
