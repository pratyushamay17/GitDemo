package pack1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.java.util.jar.pack.Attribute.Layout.Element;

public class Checkexist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.navigate().to("www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("selenium");
		d.findElement(By.name("btnG")).click();
		explicitWait(d,"Selenium: Benefits, Uses, Side Effects, Dosage, and More");

		WebElement s= d.findElement(By.partialLinkText("Selenium: Benefits, Uses, Side Effects, Dosage, and More"));
		
		System.out.println(s);

		

	}
	
	
	public static void explicitWait(WebDriver d, String text){
		(new WebDriverWait(d,10)).until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(text)));
	}
	
	public static boolean Exist(WebElement e){
		try{
			return e.isDisplayed();
		}
		catch(NoSuchElementException e1){
			return false;
		}
		catch(Exception e1){
			return false;
		}
	}

}
