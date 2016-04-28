package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Airasia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.airasia.com/au/en/home.page?cid=1");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
				d.manage().window().maximize();
				d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		d.findElement(By.xpath("//span[@class='flight']")).click();
		d.findElement(By.xpath("//label[@for='ControlGroupCompactView_AvailabilitySearchInputCompactView_OneWay']")).click();
		d.findElement(By.xpath("//div[@class='multicoldd-drop-arrow multicoldd-toggle']")).click();
		d.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();
		d.findElement(By.xpath("//img[@class='datepicker_trigger']")).click();
		d.findElement(By.xpath("/html/body/div/div[3]/table/tbody/tr[4]/td[4]/a")).click();
		d.findElement(By.xpath("//input[@requiredempty='Destination']")).sendKeys("New Delhi");
		d.findElement(By.xpath("//a[@data-value='DEL']")).click();
		//d.findElements(By.xpath("//a[contains(text(),'New Delhi (DEL)')]"));
		d.findElement(By.xpath("/html/body/div/div[3]/table/tbody/tr[4]/td[5]/a")).click();
		d.findElement(By.xpath("//option[contains(text(),'INR - Indian Rupee')]"));
		d.findElement(By.xpath("//input[@class='button-3']")).click();
		System.out.println(d.getCurrentUrl());
		
	}
	

}
