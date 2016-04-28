package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=a401u39um4a3t00vb4gl8tmef7");
		d.findElement(By.name("username")).sendKeys("adminw");
		d.findElement(By.name("password")).sendKeys("admin@123");
		d.findElement(By.id("tdb1")).click();
		String url=d.getCurrentUrl();
		// if u dnt write this condition then it will click on online catalog which 
		// is on first page even though the login fails as its xpath are same before and
		// after login
		if(url.equals("http://www.gcrit.com/build3/admin/index.php")){
			d.findElement(By.linkText("Online Catalog")).click();
		}
		System.out.println(d.getCurrentUrl());
	}

}
