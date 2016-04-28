package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://executeautomation.com/demosite/Dragging.html");
		d.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		WebElement i3=d.findElement(By.id("item3"));
		WebElement i1=d.findElement(By.id("item1"));

		
		dragDrop(d, i1, i3);
		}
	public static void dragDrop(WebDriver d, WebElement i1,WebElement i4){
		Actions a=new Actions(d);
		a.dragAndDrop(i1, i4).perform();
	}
}
