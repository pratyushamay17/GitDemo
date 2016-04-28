package java1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		d.switchTo().frame(2);
		d.findElement(By.partialLinkText("com.thoughtworks.selenium.condition")).click();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.switchTo().defaultContent();
		Thread.sleep(3000);
		d.switchTo().frame("packageFrame");
		d.findElement(By.partialLinkText("AbstractWebDriverEventListener")).click();
		
	}

}
