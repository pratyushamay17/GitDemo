package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.firevox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		WebDriver d=new FirefoxDriver();
		//d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get("http://www.google.com");
		d.findElement(By.id("lst-ib")).sendKeys("airtel prepaid recharge");
		d.findElement(By.xpath("//button[@class='lsb']")).click();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.findElement(By.partialLinkText("airtel Prepaid Recharge Online | Prepaid Mobile Tariffs Plans")).click();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement airlive = d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/ul/li[5]/a"));
		WebElement bb=d.findElement(By.xpath("//strong[text()='broadband']"));
		hover(d, airlive, bb);
		String s=d.getTitle();
		System.out.println(s);
		d.navigate().back();
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement wlan=d.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/ul/li[4]/a"));

		
		hover1(d,wlan);
		System.out.println(d.getTitle());
		}
		
	public static void hover1(WebDriver d,WebElement e2){
		Actions a1=new Actions(d);
		a1.moveToElement(e2).click().perform();
	}

public static void hover(WebDriver d, WebElement e, WebElement e1) {
	Actions a=new Actions(d);
	//a.moveToElement(e).click(e1).build().perform();
a.moveToElement(e).click(e1).build().perform();
}

}