package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver d=new FirefoxDriver();
d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

d.navigate().to("https://www.youtube.com/watch?v=-eJ2cZXyJ0E");
String t=d.getTitle();
System.out.println(t);
d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

d.navigate().to("http://www.google.com");
String t1=d.getTitle();
System.out.println(t1);
d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

String t2=d.getTitle();
System.out.println(t2);
d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
d.navigate().back();
d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
d.navigate().forward();
d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
d.navigate().refresh();


d.quit();
	

	
	
	}
	

}
