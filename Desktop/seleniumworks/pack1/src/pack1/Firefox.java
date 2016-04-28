package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=new FirefoxDriver();
	    d.get("http://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("selenium");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		d.close();
	}
}
