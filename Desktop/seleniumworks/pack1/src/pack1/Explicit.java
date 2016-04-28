package pack1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class Explicit {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
WebDriver d=new FirefoxDriver();
d.navigate().to("http://www.google.com");
WebDriverWait w=new WebDriverWait(d,20);
w.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
d.findElement(By.id("lst-ib")).sendKeys("selenium");
d.findElement(By.name("btnG")).click();
ScreenShot(d);

Thread.sleep(3000);
d.findElement(By.partialLinkText("Selenium - Wikipedia, the free encyclopedia")).click();
Thread.sleep(2000);
d.findElement(By.linkText("View history")).click();
	}

public static void ScreenShot(WebDriver d) throws IOException {
	File f= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File("P:\\screenshot.jpg"));
}
//	WebElement more = d.findElement(By.id("hdtb-more"));
//	WebElement book=d.findElement(By.xpath("//a[contains(text(),'Books')]"));
//	Hover(d,more,book);
//	
//	}	
//public static void Hover(WebDriver d, WebElement e, WebElement e1){
//	Actions a=new Actions(d);
//	a.moveToElement(e).click(e1).build().perform();
}



