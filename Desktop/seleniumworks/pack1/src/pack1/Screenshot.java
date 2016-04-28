package pack1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("airtel prepaid recharge");
		d.findElement(By.name("btnG")).click();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		Thread.sleep(2000);
		
//		explicitWait(d," Plans in India | 3G Tariff Plans for Prepaid and ... - Airtel");
		
//		WebDriverWait w=new WebDriverWait(d,20);
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("text")));
		ScreenShot(d);
		System.out.println("screenshot taken");
	}
	
	public static void explicitWait(WebDriver d,String text){
		(new WebDriverWait(d,5)).until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("text")));
		
	}
	public static void ScreenShot(WebDriver d) throws IOException
	{
		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File n=new File("P://screenshot.jpg");
		FileUtils.copyFile(f,n);
//		or we can use this stmt
//		FileUtils.copyFile(f,new File("P://screenshot.jpg"));
	}
}
