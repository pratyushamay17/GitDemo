package pack1;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Set;


public class Popup {

	public static void main(String[] args) throws NoSuchElementException, InterruptedException{
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.navigate().to("http://executeautomation.com/demosite/index.html");
		d.findElement(By.linkText("HtmlPopup ")).click();
		
		String parent=d.getWindowHandle();
		
		java.util.Set<String> handles=d.getWindowHandles();
		int count=handles.size();
		System.out.println(count);
		
		for(String s:handles){
			if(!s.equals(parent)){
				d.switchTo().window(s);
				System.out.println(d.getCurrentUrl());
			}
		}
		
		
//		for (String windowName : d.getWindowHandles()) {
//			d.switchTo().window(windowName);
//			
//		}
		d.findElement(By.id("TitleId")).click();
		d.findElement(By.xpath("//option[@value='2']")).click();
		d.findElement(By.id("Initial")).sendKeys("M");
		d.findElement(By.id("FirstName")).sendKeys("prathyusha");
		d.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Mavoori");
		d.findElement(By.xpath("//input[@name='Female']")).click();
		d.findElement(By.id("Country")).click();
		Select drop=new Select(d.findElement(By.xpath("//select[@id='Country']")));
		drop.selectByVisibleText("India"); //or we can use the below line
		//d.findElement(By.xpath("//option[contains(text(),'India')]"));
		Thread.sleep(4000);
		d.findElement(By.xpath("//input[@value='Save']")).click();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.close();
		d.switchTo().window(parent);
		System.out.println(d.getCurrentUrl());
		
	}
	

}
