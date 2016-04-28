package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.get("http://www.google.com.au");
		Dimension d1=new Dimension(300,500);
		d.manage().window().setSize(d1);
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Point p=new Point(200,100);
		d.manage().window().setPosition(p);
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println(d.getCurrentUrl());
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			String s=d.getTitle();
			System.out.println(s);
		}
		
		d.manage().window().maximize();
d.quit();
	}

}
