package java1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.gcrit.com/build3/create_account.php?osCsid=qt5am3u3mag0u1sj40gm44jr42");
		Select dropdown= new Select(d.findElement(By.xpath("//select[@name='country']")));
		//dropdown.selectByIndex(1); //selecting by index number
		dropdown.selectByVisibleText("India"); 
		java.util.List<WebElement> e=dropdown.getOptions();
		int count=e.size();
		System.out.println(count);
		
		
	}

}
