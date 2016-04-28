package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com.au/?gfe_rd=cr&ei=2GjnVqqtBcXN8gfK3qnYAg&gws_rd=ssl");
		d.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium webdriver");
		d.findElement(By.xpath("//button[@class='lsb']")).click();
		d.manage().window().maximize(); 
		d.findElement(By.partialLinkText("Selenium (software) - Wikipedia")).click();
		d.findElement(By.linkText("Create account")).click();
		String url=d.getCurrentUrl();
		System.out.println(url);
		if(url.contains("wikipedia.org")){
			System.out.println("its an internal link redirected to same application-passed");
		}
		else{
			System.out.println("its an external link redirected to other application-failed");
		}
		d.navigate().back();
		d.findElement(By.linkText("seleniumhq.org")).click();
		url=d.getCurrentUrl();
		System.out.println(url);
		if(!url.contains("wikipedia.org")){
			System.out.println("its an external link redirected to other application-passed");
		}
		else{
			System.out.println("its an internal link redirected to same application-failed");
		}
		d.close();
	}

}
