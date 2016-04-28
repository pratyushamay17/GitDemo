package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingInline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
		d.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
	}

}
