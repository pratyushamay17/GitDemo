package java1;

import javafx.scene.control.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver d=new FirefoxDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//d.findElement(By.xpath("//input[@id='login-username']")).clear();
		d.findElement(By.xpath("//input[@type='submit']")).click();;
		
//		String u= d.getCurrentUrl();
//		System.out.println(u);
//		String h= d.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getText();
//		System.out.println(h);
//		System.out.println(d.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getTagName());
//		String p=d.getPageSource();
//	System.out.println(p);
//		String j= d.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1"));
//		System.out.println(j);
//		String t= d.getTitle();
//		System.out.println(t);
//		String w=d.getWindowHandle();
//		System.out.println(w);
		//d.close();
	}

}
