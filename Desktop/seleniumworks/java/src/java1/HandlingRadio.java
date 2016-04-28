package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.gcrit.com/build3/create_account.php?osCsid=qt5am3u3mag0u1sj40gm44jr42");
		WebElement radio = d.findElement(By.xpath("//input[@value='f']"));
		System.out.println(radio.isEnabled());
		boolean status=radio.isDisplayed();
		System.out.println(status);
		status=radio.isSelected();
		System.out.println(status);
		radio.click();
		System.out.println(radio.isSelected());
	}

}
